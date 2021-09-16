package com.example.hacktiv8latihan6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent;
    Button implicitintent;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.buttonExplicit);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.buttonImplicit);
        implicitintent.setOnClickListener(this);
        login = (Button)findViewById(R.id.buttonLogin);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonExplicit:
                Intent explicit = new Intent(getApplicationContext(), SecondPage.class);
                startActivity(explicit);
                break;

            default:
                break;
        }
        switch (v.getId()){
            case R.id.buttonImplicit:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hacktiv8.com"));
                startActivity(implicit);
                break;

            default:
                break;
        }
        switch (v.getId()){
            case R.id.buttonLogin:
                Intent login = new Intent(getApplicationContext(), LoginPage.class);
                startActivity(login);
                break;

            default:
                break;
        }
    }
}