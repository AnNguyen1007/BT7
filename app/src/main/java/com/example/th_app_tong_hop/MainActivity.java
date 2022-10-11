package com.example.th_app_tong_hop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Intent playIntent;
    private View btnSignUp;
    private Button btnVaoNgay;
    EditText editUsername, editpassword;
    private View btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        editUsername = (EditText)findViewById(R.id.editTextTextPersonName) ;
        editpassword = (EditText)findViewById(R.id.editTextTextPassword);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignIn = findViewById(R.id.button);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username ="admin";
                String password = "admin";
                if(editUsername.getText().toString().equals(username) && editpassword.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(),"Login than cong ! ",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Error ! ",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
            });
        btnVaoNgay = findViewById(R.id.btnVaoNgay);
        btnVaoNgay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);}

        });

    }
}