
package com.gonzalo.boletin_extra_2;


public class Boletin_Extra_2 {

    public static void main(String[] args) {
       Conta cuenta1=new Conta("Gonzalo Arca","ES8253647783",1.5,15000);
        Conta cuenta2=new Conta("Josefina Iglesias","ES76846568",1.5,25000);

        cuenta1.ingreso(5500);
        cuenta1.reintegro(3300);
        cuenta2.transferencia(cuenta1,1500);

        System.out.println("Cuenta1: " + cuenta1.getSaldo() + "\n" +
                "Cuenta2: " + cuenta2.getSaldo());
    }
}
    

