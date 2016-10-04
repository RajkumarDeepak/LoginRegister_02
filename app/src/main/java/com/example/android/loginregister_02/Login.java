package com.example.android.loginregister_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {
 Button  btnLogin;
  EditText etUsername, etPassword;
  TextView tvRegisterhere;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    etUsername = (EditText) findViewById(R.id.etUsername);
    etPassword =  (EditText) findViewById(R.id.etPassword);
    btnLogin = (Button) findViewById(R.id.btnLogin);
    tvRegisterhere =(TextView) findViewById(R.id.tvRegisterhere);

    btnLogin.setOnClickListener(this);
    tvRegisterhere.setOnClickListener(this);

  }

  @Override
  public void onClick(View v) {
    switch (v.getId()){

      case R.id.btnLogin:

        break;

      case R.id.tvRegisterhere:
       startActivity(new Intent(this,Registration.class));


        break;

    }
  }
}
