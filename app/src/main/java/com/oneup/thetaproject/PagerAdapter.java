package com.oneup.thetaproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FragmentGroups tab1 = new FragmentGroups();
                return tab1;
            case 1:
                FragmentCalendar tab2 = new FragmentCalendar();
                return tab2;
            case 2:
                FragmentNotes tab3 = new FragmentNotes();
                return tab3;
            case 3:
                FragmentSettings tab4 = new FragmentSettings();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}

