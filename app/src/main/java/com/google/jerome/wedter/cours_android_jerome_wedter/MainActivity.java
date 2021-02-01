package com.google.jerome.wedter.cours_android_jerome_wedter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        Button buttonTp01 = findViewById(R.id.buttonTp01);
        buttonTp01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("gestion.mbds.CALC");
                startActivity(intent);
            }
        });

        Button buttonTp02 = findViewById(R.id.buttonTp02);
        buttonTp02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("gestion.mbds.CALC2");
                startActivity(intent);
            }
        });

        Button buttonTp03 = findViewById(R.id.buttonTp03);
        buttonTp03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("gestion.mbds.CALC3");
                startActivity(intent);
            }
        });

        Button buttonTp04 = findViewById(R.id.buttonTp04);
        buttonTp04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("gestion.mbds.CALC4");
                startActivity(intent);
            }
        });
    }
}

