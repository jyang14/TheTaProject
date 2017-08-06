package com.oneup.thetaproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.oneup.thetaproject.firebase.data.User;

import java.util.ArrayList;

public class MemberScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_screen);

        ArrayList<User> arrayOfMembers = new ArrayList<>();

        MembersAdapter adapter = new MembersAdapter(this, arrayOfMembers);

        ListView listView = (ListView) findViewById(R.id.member_screen_listview);
        listView.setAdapter(adapter);

    }
}
