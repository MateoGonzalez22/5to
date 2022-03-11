package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAlimenticioTest {

    @Test
    void calcularPrecioFinal() {

        ProductoAlimenticio productoPerecedero1 = new ProductoPerecedero("Papa", "argentino", 5123523, 300, 10, 20);

        float descuento = ProductoAlimenticio.descuento;

        //Lo calculo a mano y lo comparo con el resultado de el metodo calcularPrecioFinal()

        float resultadoCorrecto = (10 * productoPerecedero1.getCosto()) / 100 + productoPerecedero1.getCosto() - descuento;

        float costo = productoPerecedero1.getCosto();
        float precioFinal = productoPerecedero1.calcularPrecioFinal();

        assertTrue(resultadoCorrecto == precioFinal);
        assertFalse(resultadoCorrecto != precioFinal);
    }
}