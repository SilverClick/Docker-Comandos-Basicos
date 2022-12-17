

package com.gonzalo.boletin_extra_1_2;

import java.util.Scanner;


public class Boletin_Extra_1_2 {

    public static void main(String[] args) {
         Scanner obxScanner= new Scanner(System.in);

        System.out.println("Introduzca o valor de a:");
        float a= obxScanner.nextFloat();
        System.out.println("Introduzca o valor de b:");
        float b= obxScanner.nextFloat();
        System.out.println("Introduzca o valor de c:");
        float c= obxScanner.nextFloat();
        System.out.println("Introduzca o valor de X:");
        float x= obxScanner.nextFloat();

        float y= (float) (a*Math.pow(x,2)+b*x+c);

        System.out.println("Y= "+y);
    }
}
    

