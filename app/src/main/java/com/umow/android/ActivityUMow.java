package com.umow.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.umow.android.util.UtilToast;


public class ActivityUMow extends Activity_Base {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(ActivityUMow.this, ActivityLogin.class);
        startActivity(intent);
        finish();
    }

    @Override protected int getContentViewResourceId() {
        return R.layout.activity_umow;
    }
}
