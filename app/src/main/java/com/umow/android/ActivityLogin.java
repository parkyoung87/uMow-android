package com.umow.android;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by xuejianyu on 11/16/14.
 */

public class ActivityLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button buttonJohn = (Button) findViewById(R.id.activity_login_button_john);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLogin.this, ActivityJohn.class);
                startActivity(intent);
            }
        };
        buttonJohn.setOnClickListener(onClickListener);
    }
}
