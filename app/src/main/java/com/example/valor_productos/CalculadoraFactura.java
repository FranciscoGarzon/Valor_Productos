package com.example.valor_productos;

public class CalculadoraFactura {
    public int calcularTotalNeto(int cantidad, int costoUnitario) {
        return cantidad * costoUnitario;
    }
    public double calcularTotalConImpuestos(int totalNeto) {
        int iva = 19;
        return totalNeto + calcularIva(totalNeto, iva);
    }

    private static double calcularIva(int totalNeto, int iva) {
        return multiplica(totalNeto, iva) / 100.0;
    }
        private static int multiplica(int a, int b) {
            if (b == 0) {
                return 0;
            }
            return a + multiplica(a, b - 1);
    }
}
