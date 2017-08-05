package com.oneup.thetaproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MemberScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_screen);

        ArrayList<Member> arrayOfMembers = new ArrayList<Member>();

        MembersAdapter adapter = new MembersAdapter(this, arrayOfMembers);

        ListView listView = (ListView) findViewById(R.id.member_screen_listview);
        listView.setAdapter(adapter);

    }
}
