package com.oneup.thetaproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.oneup.thetaproject.firebase.data.User;

import java.util.List;

/**
 * Created by johnta on 8/4/17.
 * Converts object to a view
 */

public class MembersAdapter extends ArrayAdapter<User> {

    public MembersAdapter (Context context, List<User> members) {
        super (context, 0, members);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {

        User member = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_member_screen_list_item,parent,false);
        }

        TextView memberName = (TextView) convertView.findViewById(R.id.member_screen_list_item_name);
        TextView memberDescription = (TextView) convertView.findViewById(R.id.member_screen_list_item_description);

        memberName.setText(member.name);
        memberDescription.setText(member.description);

        return convertView;
    }
}
