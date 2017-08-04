package com.oneup.thetaproject.firebase;

import android.util.Log;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.oneup.thetaproject.firebase.data.Group;
import com.oneup.thetaproject.firebase.data.GroupType;
import com.oneup.thetaproject.firebase.data.MemberLevel;
import com.oneup.thetaproject.firebase.data.User;
import com.oneup.thetaproject.firebase.handlers.DataHandler;
import com.oneup.thetaproject.firebase.handlers.GroupHandler;
import com.oneup.thetaproject.firebase.handlers.UserHandler;

import java.util.HashMap;

/**
 * Created by jinch on 8/3/2017.
 */

public class Database {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference groupsRef;
    private DatabaseReference usersRef;

    public Database() {
        firebaseDatabase = FirebaseDatabase.getInstance();
        groupsRef = firebaseDatabase.getReference("groups");
        usersRef = firebaseDatabase.getReference("users");
    }

    public void addMember(Group group, User member, MemberLevel level) {
        if (group.members != null)
            group.members = new HashMap<>();

        group.members.put(member.hash(), level);

    }

    public Group createGroup(String name, GroupType type, String description) {
        Group group = new Group(name, type, description);
        groupsRef.child(String.valueOf(group.UUID)).setValue(group);
        return group;
    }

    public Group createGroup(String name, GroupType type) {
        return createGroup(name, type, "");
    }

    public User createUser(FirebaseUser firebaseUser) {
        User user = new User(firebaseUser.getDisplayName(), firebaseUser.getEmail());
        usersRef.child(user.hash()).setValue(user);
        return user;
    }

    public void getAllMembers(Group group) {
        throw new UnsupportedOperationException();
    }

    public void getMember(String hash, UserHandler handler) {
        usersRef.child(hash).addListenerForSingleValueEvent(new SingleDataGetter<>(handler, User.class));
    }

    public void removeMember(Group group, User member) {
        throw new UnsupportedOperationException();
    }


    public void GetGroup(String hash, GroupHandler handler) {
        groupsRef.child(hash).addListenerForSingleValueEvent(new SingleDataGetter<>(handler, Group.class));
    }

    private class SingleDataGetter<T> implements ValueEventListener {
        private final DataHandler<T> handler;
        private final Class<T> classType;

        public SingleDataGetter(DataHandler<T> handler, Class<T> classType) {
            this.handler = handler;
            this.classType = classType;
        }

        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            handler.handle(dataSnapshot.getValue(classType));
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Log.v("FIREBASEDATA", databaseError.toString());
        }
    }

}


