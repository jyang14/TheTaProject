package com.oneup.thetaproject.firebase.data;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinch on 8/2/2017.
 */

public class User {

    public String name;
    public String email;

    public List<Long> groups;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        groups = new ArrayList<>();
    }


    public User() {
    }

    public String hash() {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hash = digest.digest(email.getBytes());
            BigInteger bigInt = new BigInteger(1, hash);
            return bigInt.toString(16);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return email;
        }
    }
}

