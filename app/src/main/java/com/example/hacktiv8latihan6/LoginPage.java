package com.example.hacktiv8latihan6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;

public class LoginPage extends AppCompatActivity {

    Button logintomenu;
    EditText Username;
    EditText Password;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Username = (EditText) findViewById(R.id.editUsername);
        Password = (EditText) findViewById(R.id.editPassword);
        error=(TextView)findViewById(R.id.tv_error);
        logintomenu = (Button)findViewById(R.id.buttonLoginPassword);
        logintomenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList<BasicNameValuePair> postParameters = new ArrayList<>();
                postParameters.add(new BasicNameValuePair("username", Username.getText().toString()));
                postParameters.add(new BasicNameValuePair("password", Password.getText().toString()));
                String response = null;
                try {
                    if (Username.getText().toString().equals("Anthony") && Password.getText().toString().equals("123")) {
                        Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();
                        berhasil_login(view);
                    } else {
                        Toast.makeText(getApplicationContext(), "Sorry!! username or password wrong", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    Username.setText(e.toString());
                }
            }
        });
    }
    public void berhasil_login (View theButton)
    {
        Intent s = new Intent (this, MainMenu.class);
        startActivity(s);
    }
}