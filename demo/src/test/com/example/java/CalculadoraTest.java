package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSumar() {
        assertEquals(7, calc.sumar(3, 4), "3 + 4 debe ser 7");
    }

    @Test
    void testRestar() {
        assertEquals(1, calc.restar(5, 4), "5 - 4 debe ser 1");
    }

    @Test
    void testMultiplicar() {
        assertEquals(20, calc.multiplicar(5, 4), "5 * 4 debe ser 20");
    }

    @Test
    void testDividir() {
        assertEquals(2.5, calc.dividir(5, 2), 0.0001, "5 / 2 debe ser 2.5");
    }

    @Test
    void testDividirPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(5, 0);
        });
        assertEquals("Division por cero no permitida.", exception.getMessage());
    }

    @Test
    void testSumarStrings() {
        assertEquals(9, calc.sumar("4", "5"), "4 + 5 debe ser 9");
    }
}
