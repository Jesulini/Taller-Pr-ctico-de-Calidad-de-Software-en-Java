package com.example;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division por cero no permitida.");
        }
        return (double) a / b;
    }

    public int sumar(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
