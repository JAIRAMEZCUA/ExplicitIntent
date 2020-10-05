package com.josrangel.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    TextView textView;
    Button botonSuma;
    EditText editText1, editText2;
    int numero1, numero2, resultado;
    ImageView img1,img5;
    Button btnMultiplica;
    private TextView mtxvCorreo;
    private TextView mtxvPass;
    private Button mDivBtn,mButtonResta;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydos);

        Intent intent = getIntent();

        textView=findViewById(R.id.textView);
        botonSuma = findViewById(R.id.suma);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        mButtonResta = findViewById(R.id.resta);
        btnMultiplica = findViewById(R.id.multiplica);
        mtxvCorreo = findViewById(R.id.txVCorreo);
        mDivBtn = findViewById(R.id.divide);
        mtxvPass = findViewById(R.id.txVPass);
        img5=findViewById(R.id.image5);

        String nombre = intent.getStringExtra(MainActivity.EXTRA);
        mtxvCorreo.setText(intent.getStringExtra(MainActivity.EXTRA_CORREO));
        mtxvPass.setText(intent.getStringExtra(MainActivity.EXTRA_PASS));
        if (nombre != null){
            textView.setText("Hola :"+nombre);
        }

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Integer.parseInt(editText1.getText().toString());
                numero2 = Integer.parseInt(editText2.getText().toString());
               resultado= Operaciones.suma(numero1, numero2);
                textView.setText(""+resultado);
            }
        });
        mButtonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Integer.parseInt(editText1.getText().toString());
                numero2 = Integer.parseInt(editText2.getText().toString());
                resultado= Operaciones.resta(numero1, numero2);
                textView.setText("Resta"+resultado);
            }
        });
        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Integer.parseInt(editText1.getText().toString());
                numero2 = Integer.parseInt(editText2.getText().toString());
                resultado= Operaciones.multiplicacion(numero1, numero2);
                textView.setText(""+resultado);
                img1 = findViewById(R.id.imagen1);
                img1.setImageResource(R.drawable.ic_launcher_foreground);
            }
        });
        mDivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Integer.parseInt(editText1.getText().toString());
                numero2 = Integer.parseInt(editText2.getText().toString());
                resultado = Operaciones.division(numero1, numero2);
                textView.setText(""+resultado);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(SegundaActividad.this,MainActivity3.class);
                startActivity(intent1);
            }
        });

    }
}
