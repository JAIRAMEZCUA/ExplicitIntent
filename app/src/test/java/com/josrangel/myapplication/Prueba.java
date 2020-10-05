package com.josrangel.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Prueba {
    @Test
    public void hacerSuma() {
        assertEquals(12, Operaciones.suma(6,6));
    }

    @Test
    public void hacerMultiplicacion() {
        assertEquals(36, Operaciones.multiplicacion(6,6));
    }
    @Test
    public void hacerDivision() {
        assertEquals(1, Operaciones.division(6,6));
    }

    @Test
    public void hacerResta() {
        assertEquals(0, Operaciones.resta(6,6));
    }
}
