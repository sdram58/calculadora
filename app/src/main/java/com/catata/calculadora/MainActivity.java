package com.catata.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);



        tvResultado = (TextView) findViewById(R.id.textoResultado);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),getResources().getString(R.string.mensaje_btn1),Toast.LENGTH_SHORT)
                        .show();

                tvResultado.setText(tvResultado.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Button btn = (Button)view;
        String numero = btn.getText().toString();
        Toast.makeText(getBaseContext(),"Has pulsado " + numero,Toast.LENGTH_SHORT)
                .show();

        tvResultado.setText(tvResultado.getText().toString() + numero);
    }

    public void clickBoton4(View view) {
        Button btn = (Button)view;
        String numero = btn.getText().toString();
        Toast.makeText(getBaseContext(),"Has pulsado " + numero,Toast.LENGTH_SHORT)
                .show();

        tvResultado.setText(tvResultado.getText().toString() + numero);

    }
}