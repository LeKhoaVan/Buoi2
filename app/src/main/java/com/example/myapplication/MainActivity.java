package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.btnLogin);
        edtName=findViewById(R.id.edtName);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtName.getText().equals("")) {
                    Toast.makeText(MainActivity.this,
                             "No name", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivity.this,
                        edtName.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}