
package com.gonzalo.boletin16;


public class ContaCorriente extends Conta {
     final double Interese = 1.5;

    public ContaCorriente(long numeroConta, Persoa cliente, double saldo) {
        super(numeroConta, cliente, saldo);

    }

    public ContaCorriente() {
    }

    @Override
    public void actualizarSaldo() {

        double saldo = super.getSaldo() - super.getSaldo() * (Interese / 100);

        super.setSaldo(saldo);
    }

}

