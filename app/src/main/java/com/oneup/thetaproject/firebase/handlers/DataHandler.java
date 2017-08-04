package com.oneup.thetaproject.firebase.handlers;

/**
 * Created by jinch on 8/3/2017.
 */

public interface DataHandler<T> {

    void handle(T data);
}
