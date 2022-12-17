

package com.gonzalo.boletin_extra_1_1;

import java.util.Scanner;

public class Boletin_Extra_1_1 {

    public static void main(String[] args) {
      

        Scanner obxScanner= new Scanner(System.in);

        System.out.println("Introduzca a base inponible:");
        float base= obxScanner.nextFloat();

        System.out.println("Introduzca o porcentaxe de IVE");
        float ive= obxScanner.nextFloat();

        float importeIve= base*ive/100;
        float total=base+importeIve;

        System.out.println("Importe correspondente a IVE: "+importeIve+"€."+"\n"+
                "Total: "+total+"€.");
    }
}
    
    

