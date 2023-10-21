package com.example.valor_productos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraFacturaTest {

    @Test
    public void calcularTotalNeto() {
        CalculadoraFactura calculadora = new CalculadoraFactura();
        int cantidad = 10;
        int costoUnitario = 1000;
        int totalNeto = calculadora.calcularTotalNeto(cantidad, costoUnitario);
        assertEquals(10000, totalNeto);
    }

    @Test
    public void calcularTotalConImpuestos() {
        CalculadoraFactura calculadora = new CalculadoraFactura();
        int totalNeto = 10000;
        double totalConImpuestos = calculadora.calcularTotalConImpuestos(totalNeto);
        assertEquals(11900.0, totalConImpuestos, 0.1);
    }
}