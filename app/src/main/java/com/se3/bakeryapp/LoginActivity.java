package com.se3.bakeryapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginbtn;
    EditText username, password;
    boolean isAllFieldsValid = false;

    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //customize status bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // register buttons with their proper IDs.
        loginbtn = findViewById(R.id.login_btn);

        // register all the EditText fields with their IDs.
        username = findViewById(R.id.login_username_input_field);
        password = findViewById(R.id.login_password_input_field);

        //handle text change
        textChangeValidator();

        // handle the signin/login button
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // store the returned value of the dedicated function which checks whether the entered data is valid or if any fields are left blank.
                isAllFieldsValid = CheckAllFields();

                // the boolean variable turns to be true then only the user must be proceed to the main activity
                if (isAllFieldsValid) {
                    Toast.makeText(LoginActivity.this, "validated", Toast.LENGTH_SHORT).show();
                    //Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    //startActivity(i);
                }
            }
        });

    }

    // function which checks all the text fields are filled or not by the user.
    // when user clicks on the PROCEED button this function is triggered.
    private boolean CheckAllFields() {
        if (username.length() == 0) {
            username.setError("*required");
            username.requestFocus();
            return false;
        }

        if (password.length() == 0) {
            password.setError("*required");
            password.requestFocus();
            return false;
        } else if (password.length() < 8) {
            password.setError("Password must be minimum 8 characters");
            password.requestFocus();
            return false;
        }
        return true;
    }

    //validate form fields while typing
    private void textChangeValidator() {
        username.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    username.setError("*required");
                    username.requestFocus();
                }
            }
        });

        password.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    password.setError("*required");
                    password.requestFocus();
                } else if (s.length() < 8) {
                    password.setError("Password must be minimum 8 characters");
                    password.requestFocus();
                }
            }
        });
    }
}