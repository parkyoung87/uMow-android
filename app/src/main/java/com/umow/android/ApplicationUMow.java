package com.umow.android;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by xuejianyu on 11/19/14.
 */
public class ApplicationUMow extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "7CDdNSW5PWKA31rG1EfJTNs7yxCtqsL04gAu3pr3", "XWOJZCOgDX3bpeog36Sd17D5aUSRS9o4dx9Ev2no");
    }
}
