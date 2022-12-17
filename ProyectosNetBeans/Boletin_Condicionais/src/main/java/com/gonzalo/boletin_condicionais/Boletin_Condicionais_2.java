
package com.gonzalo.boletin_condicionais;

import javax.swing.JOptionPane;


public class Boletin_Condicionais_2 {
     public void asociacionDevinicultores() {

        int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o precio"));

        int kiloUva = Integer.parseInt(JOptionPane.showInputDialog("Introduzca os kilos"));

        int totalEuros = precio * kiloUva;

        String tipo = JOptionPane.showInputDialog("Introduce si e a o b  : ");

        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce o tamaño 1 o 2 "));

        if (tipo.equals("a") && tamaño == 1) {
            System.out.println("El total es : " + (0.20 * kiloUva + totalEuros));
        } else if (tipo.equals("a") && tamaño == 2) {
            System.out.println("El total es : " + (0.30 * kiloUva + totalEuros));
        } else if ((tipo.equals("b ") && tamaño == 1)) {
            System.out.println("O total e : " + (0.30 * kiloUva - totalEuros));
        } else if ((tipo.equals("b") && tamaño == 2)) {
            System.out.println("O total e : " + (0.50 * kiloUva - totalEuros));
        }

    }
}

