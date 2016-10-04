package com.example.android.loginregister_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  Button btnLogout;
  EditText etName, etAge, etUsername ;

  @Override
  public void onClick(View v) {

    switch (v.getId()){
      case R.id.btnLogout:

        break;
    }
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    etName =(EditText)findViewById(R.id.etName);
    etAge = (EditText) findViewById(R.id.etAge);
    etUsername =(EditText) findViewById(R.id.etUsername);

    btnLogout =(Button) findViewById(R.id.btnRegister);

    btnLogout.setOnClickListener(this);


  }
}
