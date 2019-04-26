package com.megadahliana.kotlinkalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    //TAMBAHAM
    EditText user, pass;
    Button login;

    final String username = "admin";
    final String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //tambahan
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginkuy();
            }
        });


    }

    private void loginkuy() {

        if (user.length()==0 && pass.length()==0){
            user.setText("");
            pass.setText("");
           user.requestFocus();
            Toast.makeText(LoginActivity.this,"Isi Data",Toast.LENGTH_SHORT).show();
        }else if (user.getText().toString().trim().matches(username)&&pass.getText().toString().trim().matches(password)){
            Intent i = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(i);
        }else{
            Toast.makeText(LoginActivity.this,"Username atau sandi salah cek",Toast.LENGTH_SHORT).show();
        }

    }
}