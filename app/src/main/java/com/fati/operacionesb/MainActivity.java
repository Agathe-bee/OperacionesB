package com.fati.operacionesb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declarar objetos a utilizar

    EditText num1, num2;
    RadioButton rbtnSum, rbtnRes, rbtnMulti, rbtnDiv;
    Button btnEjecutar, btnSalir;
    TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hacer la comunicación entre la parte lógica y de diseño

        num1 = findViewById(R.id.txtnum1);
        num2 = findViewById(R.id.txtnum2);

        rbtnSum = findViewById(R.id.buttonSum);
        rbtnRes = findViewById(R.id.buttonRes);
        rbtnMulti = findViewById(R.id.buttonMul);
        rbtnDiv = findViewById(R.id.buttonDiv);

        btnEjecutar = findViewById(R.id.buttonEjec);
        btnSalir = findViewById(R.id.buttonSalir);

        txtresultado = findViewById(R.id.txtRes);

        //Procesos

        btnEjecutar.setOnClickListener(V->{

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());

            float n11 = Float.parseFloat(num1.getText().toString());
            float n22 = Float.parseFloat(num2.getText().toString());

            //Caso suma
            if (rbtnSum.isChecked()){

                int suma = n1 + n2;
                txtresultado.setText(String.valueOf(suma));

            }
            //Caso resta
            if (rbtnRes.isChecked()){

                int res = n1 - n2;
                txtresultado.setText(String.valueOf(res));

            }
            //Caso multlipicacion
            if (rbtnMulti.isChecked()){

                int multi = n1 * n2;
                txtresultado.setText(String.valueOf(multi));

            }
            //Caso division
            if (rbtnDiv.isChecked()){

                float div = n11 / n22;
                txtresultado.setText(String.valueOf(div));

            }

        });

        btnSalir.setOnClickListener(V->finish());




    }
}