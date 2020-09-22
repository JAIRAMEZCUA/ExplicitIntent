package com.josrangel.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydos);

        Intent intent = getIntent();

        textView=findViewById(R.id.textView);

        String nombre = intent.getStringExtra(MainActivity.EXTRA);

        if (nombre != null){
            textView.setText("Hola :"+nombre);
        }
    }
}
