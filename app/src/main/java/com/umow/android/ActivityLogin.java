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

public class ActivityLogin extends Activity_Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        {
            Button buttonTom = (Button) findViewById(R.id.activity_login_button_tom);
            buttonTom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(ActivityLogin.this, ActivityTom.class);
                    startActivity(intent);
                }
            });
        }
        {
            Button buttonYoung = (Button) findViewById(R.id.activity_login_button_young);
            buttonYoung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(ActivityLogin.this, ActivityYoung.class);
                    startActivity(intent);
                }
            });
        }

        {
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

    @Override protected int getContentViewResourceId() {
        return R.layout.activity_login;
    }
}
