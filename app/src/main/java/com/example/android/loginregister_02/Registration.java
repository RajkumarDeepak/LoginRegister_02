package com.example.android.loginregister_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity implements View.OnClickListener {

  Button btnRegister;
  EditText etName, etAge, etUsername, etPassword;


  @Override
  public void onClick(View v) {
    switch(v.getId()){

      case R.id.btnRegister:

        break;
    }
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registration);


      etName =(EditText)findViewById(R.id.etName);
      etAge = (EditText) findViewById(R.id.etAge);
      etUsername =(EditText) findViewById(R.id.etUsername);
      etPassword =(EditText) findViewById(R.id.etPassword);
      btnRegister =(Button) findViewById(R.id.btnRegister);

    btnRegister.setOnClickListener(this);





  }
}
