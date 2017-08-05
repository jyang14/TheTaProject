package com.oneup.thetaproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Member;
import java.util.ArrayList;

/**
 * Created by johnta on 8/4/17.
 * Converts object to a view
 */

public class MembersAdapter extends ArrayAdapter<Member> {

    public MembersAdapter (Context context, ArrayList<Member> members) {
        super (context, 0, members);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {

        Member member = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.member_screen_list_item,parent,false);
        }

        TextView memberName = (TextView) convertView.findViewById(R.id.member_screen_list_item_name);
        TextView memberDescription = (TextView) convertView.findViewById(R.id.member_screen_list_item_description);

        memberName.setText(member.name);
        memberDescription.setText(member.description);

        return convertView;
    }
}
