
package com.gonzalo.boletin16;

import javax.swing.JOptionPane;


public class Boletin16 {

    public static void main(String[] args) {
          Persoa cliente1 = new Persoa("Gonzalo", "Arca", "G47862h");
        String tipoCuenta = JOptionPane.showInputDialog(null, "Conta Corriente: C  Conta Ahorro: A");

        switch (tipoCuenta.toUpperCase()) {
            case "C":
                ContaCorriente cuenC = new ContaCorriente(54511244, cliente1, 10800);
                realizarOperacion(cuenC);
                break;

            case "A":
                ContaAhorro cueA = new ContaAhorro(9876542, cliente1, 10000, 2);
                realizarOperacion(cueA);
                break;
        }
    }

    private static void realizarOperacion(Conta cuenta) {
        String operacion;
        double euros;
        operacion = JOptionPane.showInputDialog(null, "******** Bienvenido a BBva ******* \n . "
                + "O seu saldo e : " + cuenta.getSaldo() + "\n"
                + " Ingresar: A  Retirar: B  Actualizar: C");

        switch (operacion.toUpperCase()) {
            case "A":
                euros = Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad"));
                cuenta.Ingresar(euros);

                break;

            case "B":
                euros = Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad"));
                cuenta.Retirar(euros);
                break;

            case "C":
                cuenta.actualizarSaldo();
                break;

        }
        JOptionPane.showMessageDialog(null, "O seu saldo e : " + cuenta.getSaldo());

    }
}
    

