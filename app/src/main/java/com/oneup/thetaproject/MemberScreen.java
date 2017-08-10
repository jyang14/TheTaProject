package com.oneup.thetaproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.oneup.thetaproject.firebase.data.User;

import java.util.ArrayList;

public class MemberScreen extends AppCompatActivity {

    MembersAdapter adapter;

    String identification;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_screen);

        ArrayList<User> arrayOfMembers = new ArrayList<>();

        adapter = new MembersAdapter(this, arrayOfMembers);

        ListView listView = (ListView) findViewById(R.id.member_screen_listview);

        Intent intent = getIntent();
        identification = intent.getStringExtra("identification");
        name = intent.getStringExtra("name");
        addMember(name,identification);

        listView.setAdapter(adapter);
    }

    public void addMember (String name, String description) {
        User newUser = new User(name, description);
        adapter.add(newUser);
    }

    public void goToAddMemberPopup (View v) {
        startActivity(new Intent(MemberScreen.this, FragmentAddMemberToGroup.class));
    }

    public void goToMainScreen (View v) {
        finish();
        startActivity(new Intent(MemberScreen.this, FragmentAddMemberToGroup.class));
    }
}
