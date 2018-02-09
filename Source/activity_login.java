package com.example.sunny.vineethicp4login; /**
 * Created by sunny on 2/8/2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sunny.vineethicp4login.R;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void CheckLoginCredentials(View view) {

        EditText usernameTxt = (EditText) findViewById(R.id.username);
        EditText passwordTxt = (EditText) findViewById(R.id.password);
        TextView errorTxt = (TextView) findViewById(R.id.error);
        String userName = usernameTxt.getText().toString();
        String passWord = passwordTxt.getText().toString();

        boolean validationFlag = false;
        if (!userName.isEmpty() && !passWord.isEmpty()) {
            if (userName.equals("vineeth") && passWord.equals("Vineeth@93")) {
                validationFlag = true;
            }
        }

        if(!validationFlag){
            errorTxt.setVisibility(View.VISIBLE);
        }

        else{
//This code redirects the from login page to the home page.
            Intent redirect = new Intent(activity_login.this, translate_activity.class);
            startActivity(redirect);
        }

    }
}
