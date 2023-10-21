package com.example.valor_productos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_resultado extends AppCompatActivity {
    private TextView tvTotalNeto;
    private TextView tvTotalConImpuestos;

    private CalculadoraFactura calculadora = new CalculadoraFactura();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvTotalNeto = findViewById(R.id.tvTotalNeto);
        tvTotalConImpuestos = findViewById(R.id.tvTotalConImpuestos);

        // Recuperar los datos enviados desde la primera pantalla
        Intent intent = getIntent();
        int cantidad = intent.getIntExtra("cantidad", 0);
        int costoUnitario = intent.getIntExtra("costoUnitario", 0);
        int totalNeto = calculadora.calcularTotalNeto(cantidad, costoUnitario);
        double totalConImpuestos = calculadora.calcularTotalConImpuestos(totalNeto);


        // Mostrar los resultados
       tvTotalNeto.setText("Total Neto: " + totalNeto);
       tvTotalConImpuestos.setText("Total con Impuestos: " + totalConImpuestos);
    }
}
