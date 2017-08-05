package com.oneup.thetaproject;

/**
 * Created by johnta on 8/4/17.
 */

public class Member {

    //What the adapter is made out of... objects of Member

    public String name;
    public String description;
    //TO-DO: Avatars??

    public Member (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName () {
        return name;
    }

    public String getDescription () {
        return description;
    }
}
