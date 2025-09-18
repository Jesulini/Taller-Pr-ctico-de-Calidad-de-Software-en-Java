package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        try {
            // Pedir números al usuario
            String input1 = JOptionPane.showInputDialog("Digite el primer número:");
            String input2 = JOptionPane.showInputDialog("Digite el segundo número:");

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            // Construir resultados
            StringBuilder resultados = new StringBuilder();
            resultados.append("Resultados de la Calculadora:\n");
            resultados.append(num1).append(" + ").append(num2).append(" = ").append(calc.sumar(num1, num2)).append("\n");
            resultados.append(num1).append(" - ").append(num2).append(" = ").append(calc.restar(num1, num2)).append("\n");
            resultados.append(num1).append(" * ").append(num2).append(" = ").append(calc.multiplicar(num1, num2)).append("\n");

            try {
                resultados.append(num1).append(" / ").append(num2).append(" = ").append(calc.dividir(num1, num2)).append("\n");
            } catch (IllegalArgumentException e) {
                resultados.append("Error en división: ").append(e.getMessage()).append("\n");
            }

            // Mostrar en JOptionPane
            JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Debe digitar números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
