package com.oneup.thetaproject.firebase;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by jinch on 8/10/2017.
 */

public class Storage {

private FirebaseStorage firebaseStorage;

     public Storage(){
         firebaseStorage = FirebaseStorage.getInstance();

     }

    /**
     * method: getImage
     * <p>
     * Gets the bitmap image by and puts it in the ImageView
     *
     * @param name      Name/hash of image
     * @param imageView ImageView to display the image in
     * @param context Current application context
     */
    public void getImage(String name, ImageView imageView, Context context) {
        StorageReference storageRef = firebaseStorage.getReference().child(name);

        Glide.with(context)
                .using(new FirebaseImageLoader())
                .load(storageRef)
                .into(imageView);
    }

}
