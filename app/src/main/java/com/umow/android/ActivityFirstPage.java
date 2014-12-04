package com.umow.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by xuejianyu on 11/16/14.
 */

public class ActivityFirstPage extends Activity_Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        {
            Button buttonJohn = (Button) findViewById(R.id.activity_login_button_john);
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ActivityFirstPage.this, ActivityJohn.class);
                    startActivity(intent);
                }
            };
            buttonJohn.setOnClickListener(onClickListener);
        }



        {
            Button buttonLogin = (Button) findViewById(R.id.activity_login_button_login);
            buttonLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(ActivityFirstPage.this, ActivityLogin.class);
                    startActivity(intent);
                }
            });
        }

        {
            ((Button) findViewById(R.id.activity_login_button_createaccount)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(ActivityFirstPage.this, ActivityCreateAccount.class);
                    startActivity(intent);
                }
            });
        }

    }

    @Override protected int getContentViewResourceId() {
        return R.layout.activity_firstpage;
    }
}
