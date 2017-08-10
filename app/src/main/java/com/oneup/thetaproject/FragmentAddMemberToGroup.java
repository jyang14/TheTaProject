package com.oneup.thetaproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.EditText;

public class FragmentAddMemberToGroup extends Fragment {

    // TO DO = IMPLEMENT BUNDLES STUFF
    String identification;
    String name;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onClickAddMembertoGroup (View v) {
        identification = ((EditText) getView().findViewById(R.id.add_member_identification)).getText().toString();

        Intent intent = new Intent (getContext(),MemberScreen.class);
        intent.putExtra("identification",identification);
        intent.putExtra("name",name);

        startActivity(intent);
    }

}
