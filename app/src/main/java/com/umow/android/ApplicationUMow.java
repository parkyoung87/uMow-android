package com.umow.android;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by xuejianyu on 11/19/14.
 */
public class ApplicationUMow extends Application {

    private final String PARSE_APPLICATION_ID = "0y3GzfHi8eHIOcKjiE420Rjdw6ClphfoZ1bWbUfn";
    private final String PARSE_CLIENT_KEY = "wYXDCmQge9mhAi61sd7uhpezwDLx0SI1qbXHCCEx";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, PARSE_APPLICATION_ID, PARSE_CLIENT_KEY);
    }
}
