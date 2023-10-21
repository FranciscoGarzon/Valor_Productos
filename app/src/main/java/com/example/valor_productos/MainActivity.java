package com.example.valor_productos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etCantidad;
    private EditText etCostoUnitario;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCantidad = findViewById(R.id.etCantidad);
        etCostoUnitario = findViewById(R.id.etCostoUnitario);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos();
            }
        });
    }

    private void enviarDatos() {
        // Obtener la cantidad y el costo unitario
        int cantidad = Integer.parseInt(etCantidad.getText().toString());
        int costoUnitario = Integer.parseInt(etCostoUnitario.getText().toString());

        // Pasar a la segunda pantalla y enviar los resultados
        Intent intent = new Intent(this, activity_resultado.class);
        intent.putExtra("cantidad", cantidad);
        intent.putExtra("costoUnitario", costoUnitario);
        startActivity(intent);
    }


}
