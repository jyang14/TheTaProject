package com.oneup.thetaproject.firebase.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jinch on 8/2/2017.
 */

public class Group {

    public String name;
    public String description;
    public GroupType type;

    public long UUID;
    public Map<String, MemberLevel> members;
    public List<String> events;

    public Group(){
        name = "";
        type = GroupType.CLASS;
        description = "";

        UUID = 0;
        members = new HashMap<>();
        events = new ArrayList<>();
    }

    public Group(String name, GroupType type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;

        UUID = 0;
        members = new HashMap<>();
        events = new ArrayList<>();
    }

}
