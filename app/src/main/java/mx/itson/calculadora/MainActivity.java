package mx.itson.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2; //Declaramos los EditText


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciamos el num1 y num2 con los txtNum1 y txtNum2
        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);


        (findViewById(R.id.btnSuma)).setOnClickListener(this);
        (findViewById(R.id.btnResta)).setOnClickListener(this);
        (findViewById(R.id.btnMul)).setOnClickListener(this);
        (findViewById(R.id.btnDiv)).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    //Va a entrar a cada caso dependiendo de la opcion que se haya elegido
        if (v.getId() == R.id.btnSuma){
            //Aqui realizamos la suma
            //En la variable total realizamos la suma de num1 + num2
            //Se usa Integer para convertir el texto guardado en num1 y num2 a numero entero.
            int total = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
            Toast.makeText(this, "Total: " + total, Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.btnResta) {
            //Resta
            //En la variable total realizamos la resta de num1 - num2
            //Se usa Integer para convertir el texto guardado en num1 y num2 a numero entero.
            int total = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
            Toast.makeText(this, "Total: " + total, Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.btnMul) {
            //Multiplicacion
            //En la variable total realizamos la multiplicacion de num1 * num2
            //Se usa Integer para convertir el texto guardado en num1 y num2 a numero entero.
            int total = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
            Toast.makeText(this, "Total: " + total, Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.btnDiv) {
            //Divicion
            //En la variable total realizamos la divicion de num1 / num2
            //Se usa Integer para convertir el texto guardado en num1 y num2 a numero entero.
            int total = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
            Toast.makeText(this, "Total: " + total, Toast.LENGTH_SHORT).show();

        }

    }
}