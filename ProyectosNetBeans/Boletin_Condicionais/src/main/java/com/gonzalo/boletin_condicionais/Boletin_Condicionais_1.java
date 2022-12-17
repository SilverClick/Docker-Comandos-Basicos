
package com.gonzalo.boletin_condicionais;

import javax.swing.JOptionPane;


public class Boletin_Condicionais_1 {
    
      public void aplicacionEnteiro() {
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

        if (numero >= 0 && numero < 10){
            System.out.println("E unha cifra");
        } 
        else if (numero>= 10 && numero < 100){
            System.out.println("E duas cifras");
        }
        else if (numero >= 100 && numero < 1000){
            System.out.println("E tres cifras");
        } 
        else if (numero >= 1000 && numero < 10000){
            System.out.println("E catro cifras");
        } 
        else if (numero>=10000 && numero<100000){
            System.out.println("E cinco cifras");
        }
        

    }
}

