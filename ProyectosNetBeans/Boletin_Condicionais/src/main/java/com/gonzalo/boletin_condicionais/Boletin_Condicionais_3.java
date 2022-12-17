
package com.gonzalo.boletin_condicionais;

import javax.swing.JOptionPane;

class Boletin_Condicionais_3 {
    public void organizacionDeEscuela(){
         int numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Cantos alumnos son? "));
        
        
        if(numeroAlumnos>=100)
            System.out.println("O pago por cada alumno e de 65 Euros \n"  + "O pago da axencia e  : " + numeroAlumnos*65 + "Euros" );
        else if (numeroAlumnos<100 && numeroAlumnos>=50 )
            System.out.println("O pago por cada alumno e de 70 Euros \n"  + "O pago da axencia e  : " + numeroAlumnos*70 + "Euros"  );
        else if (numeroAlumnos<50 && numeroAlumnos>=30 )
            System.out.println("o pago por cada alumno e de 95  Euros \n"  + "o pago da axencia e  : " + numeroAlumnos*95 + "Euros" );
        else {
            System.out.println("O coste da renta do autobus e de 4000 Euros \n"  + " O pago de cada alumno e   : " + (4000/numeroAlumnos) + " Euros " );
        }
    }
    }

