package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent nextPage = new Intent(MainActivity.this,  Two.class);

        TextView tx1 = findViewById(R.id.tx1);
        getResources().getString(R.string.yahya);
        Button bt1 = findViewById(R.id.button);
startActivity(nextPage);

    }

}