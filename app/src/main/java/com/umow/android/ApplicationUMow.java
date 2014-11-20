package com.umow.android;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by xuejianyu on 11/19/14.
 */
public class ApplicationUMow extends Application {

    private final String PARSE_APPLICATION_ID = "7CDdNSW5PWKA31rG1EfJTNs7yxCtqsL04gAu3pr3";
    private final String PARSE_CLIENT_KEY = "XWOJZCOgDX3bpeog36Sd17D5aUSRS9o4dx9Ev2no";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, PARSE_APPLICATION_ID, PARSE_CLIENT_KEY);
    }
}
