package com.example.richellerazon.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.ocean);
    }
}
