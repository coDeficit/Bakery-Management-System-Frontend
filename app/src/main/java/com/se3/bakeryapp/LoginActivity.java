package com.se3.bakeryapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.se3.bakeryapp.api.ApiClient;
import com.se3.bakeryapp.api.ApiService;
import com.se3.bakeryapp.models.pojos.LoginModel;
import com.se3.bakeryapp.models.pojos.UserModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    Button loginbtn;
    EditText user_name, pass;
    TextView uid, uname, upass;
    boolean isAllFieldsValid = false;
    private ApiService apiService;
    private String username, password;

    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //customize status bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // register views with their proper IDs.
        loginbtn = findViewById(R.id.login_btn);
        user_name = findViewById(R.id.login_username_input_field);
        pass = findViewById(R.id.login_password_input_field);
        uid = findViewById(R.id.test_login_userid);
        uname = findViewById(R.id.test_login_username);
        upass = findViewById(R.id.test_login_password);

        //handle text change
        textChangeValidator();

        // handle the signin/login button
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // store the returned value of the dedicated function which checks whether the entered data is valid or if any fields are left blank.
                isAllFieldsValid = CheckAllFields();

                username = user_name.getText().toString();
                password = pass.getText().toString();


                // the boolean variable turns to be true then only the user must be proceed to the main activity
                if (isAllFieldsValid) {
                    Toast.makeText(LoginActivity.this, "validated", Toast.LENGTH_SHORT).show();
                    signIn(username, password);
                }
            }
        });

    }

    private void signIn(String username, String password) {
        LoginModel login = new LoginModel(username, password);
        Log.v("Loginusername", login.getUsername());
        //UserModel user = new UserModel();

        Call<UserModel> loginResponseCall = ApiClient.getApiService().getLoggedUser(login);
        loginResponseCall.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                if(response.isSuccessful()){
                    Toast.makeText(LoginActivity.this,"Login Successful", Toast.LENGTH_LONG).show();
                    UserModel userModel = response.body();

                    Log.v("LoginResponse", String.valueOf(response.body()));

                   String uidstr = "Userid: " + String.valueOf(userModel.getUserid());
                    String unamestr = "Username: " + userModel.getUsername();
                    String upassstr = "Password: " + userModel.getPassword();
                    uid.setText(uidstr);
                    uname.setText(unamestr);
                    upass.setText(upassstr);

                    Log.v("UserData", String.valueOf(userModel));
                    Log.v("Username", userModel.getUsername());
                    Log.v("Login Password", password);

                    /*new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            startActivity(new Intent(LoginActivity.this,DashboardActivity.class).putExtra("data",loginResponse.getUsername()));
                        }
                    },700);*/

                }else{
                    Toast.makeText(LoginActivity.this,"Login Failed", Toast.LENGTH_LONG).show();

                }

            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Toast.makeText(LoginActivity.this,"Throwable "+t.getLocalizedMessage(), Toast.LENGTH_LONG).show();

            }
        });

        /*
        Call<UserModel> call = apiService.getLoggedUser(login);
                call.enqueue(new Callback() {
                    @Override
                    public void onResponse(Call call, Response response) {
                        Log.v("DEBUG", "Requested url: " + call.request().url().toString());
                        if (response.isSuccessful()) {
                            UserModel aUser = (UserModel) response.body();

                            Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                            Log.v("DEBUG", "User gotten from DB: ");
                            String uidstr = "Userid: " + aUser.getUserid();
                            String unamestr = "Username: " + aUser.getUsername();
                            String upassstr = "Password: " + aUser.getPassword();
                            uid.setText(uidstr);
                            uid.setText(unamestr);
                            uid.setText(upassstr);

                        } else {
                            if (response.code() == 500) {
                                Toast.makeText(getApplicationContext(), R.string.server_connection_error, Toast.LENGTH_LONG).show();
                            }
                            if (response.code() == 401) {
                                Toast.makeText(getApplicationContext(), R.string.invalid_login_credentials, Toast.LENGTH_LONG).show();
                            }

                            Log.v("Request Error", String.format("Code: %d, text: %s, more text: %s", response.code(), response.message(), response.raw().body().toString()));
                        }

                    }

                    @Override
                    public void onFailure(Call call, Throwable t) {
                        Log.v("ERROR", "Call failed: " + t.toString());
                        call.cancel();
                        Toast.makeText(getApplicationContext(), R.string.server_connection_error, Toast.LENGTH_LONG).show();
                    }
                });*/

    }

    // function which checks all the text fields are filled or not by the user.
    // when user clicks on the PROCEED button this function is triggered.
    private boolean CheckAllFields() {
        if (user_name.length() == 0) {
            user_name.setError("*required");
            user_name.requestFocus();
            return false;
        }

        if (pass.length() == 0) {
            pass.setError("*required");
            pass.requestFocus();
            return false;
        } else if (pass.length() < 8) {
            pass.setError("pass must be minimum 8 characters");
            pass.requestFocus();
            return false;
        }
        return true;
    }

    //validate form fields while typing
    private void textChangeValidator() {
        user_name.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    user_name.setError("*required");
                    user_name.requestFocus();
                }
            }
        });

        pass.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    pass.setError("*required");
                    pass.requestFocus();
                } else if (s.length() < 8) {
                    pass.setError("pass must be minimum 8 characters");
                    pass.requestFocus();
                }
            }
        });
    }
}