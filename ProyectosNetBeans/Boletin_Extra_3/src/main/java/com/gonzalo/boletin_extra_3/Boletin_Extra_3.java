
package com.gonzalo.boletin_extra_3;

import java.util.Scanner;


public class Boletin_Extra_3 {

    public static void main(String[] args) {
          boletinExtra3_1();
         esFechaValida();
    }

    private static void boletinExtra3_1() {
        System.out.println(" ******* Bienvenido ao club de padel ******** ");
        final int CUOTA = 800;
        final int PORCENTAJE_MAYORES = 40;
        final int PORCENTAJE_JOVEN_SOCIO = 45;
        final int PORCENTAJE_JOVEN_NO_SOCIO = 25;

        int edad, cuotaI;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca a idade do nuevo socio");

        edad = teclado.nextInt();

        cuotaI = CUOTA;

        if (edad >= 65) {
            cuotaI -= CUOTA * PORCENTAJE_MAYORES / 100;

        } else if (edad < 21) {
            System.out.println("¿O pai e socio(si/no)?: ");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("si")) {
                cuotaI -= CUOTA * PORCENTAJE_JOVEN_SOCIO / 100;
            } else {
                cuotaI -= CUOTA * PORCENTAJE_JOVEN_NO_SOCIO / 100;
            }

        }
        System.out.println("Debe pagar: " + cuotaI);
    }

    private static void esFechaValida() {
       
        int dia, mes, año;
        Scanner scanner = new Scanner(System.in);
         System.out.println(" ******* Validador de fechas ******** ");

        System.out.println("Introduzca o dia");
        dia = scanner.nextInt();
        System.out.println("Introduzca o mes");
        mes = scanner.nextInt();
        System.out.println("Introduzca o ano ");
        año = scanner.nextInt();

        if (eFechaValida(dia, mes, año)) {
            System.out.println("A fecha e valida");
        } else {
            System.out.println("A fecha NON e valida");
        }
    }

    private static boolean eFechaValida(int dia, int mes, int año) {
        int diasMes;
        boolean resultado;

        if (mes < 1 || mes > 12) {
           return false;
        }

        if (año < 1600 || año > 3000) {
                      return false;

        }

        switch (mes) {
            case 4:diasMes = 30;
                break;
            case 6:diasMes = 30;
                break;
            case 9:diasMes = 30;
                break;
            case 11:
                diasMes = 30;
                break;

            case 2:
                if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;

            default:
                diasMes = 31;

        }
        
        resultado = dia >= 1 && dia <= diasMes;

        return resultado;

    }

}
    
