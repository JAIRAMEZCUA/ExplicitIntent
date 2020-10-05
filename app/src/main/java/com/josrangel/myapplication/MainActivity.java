package com.josrangel.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    public static String EXTRA= "MainActivity.EXTRA_NOMBRE";
    public static String EXTRA_CORREO= "MainActivity.EXTRA_CORREO";
    public static String EXTRA_PASS= "MainActivity.EXTRA_PASS";
    private EditText mCorreo;
    private EditText mContrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        mCorreo = findViewById(R.id.editTextTextPersonName2);
        mContrasena = findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this,SegundaActividad.class);
                intent.putExtra(EXTRA,"Juan");
                intent.putExtra(EXTRA_CORREO,mCorreo.getText().toString());
                intent.putExtra(EXTRA_PASS,mContrasena.getText().toString());
                startActivity(intent);

            }
        });
    }
}