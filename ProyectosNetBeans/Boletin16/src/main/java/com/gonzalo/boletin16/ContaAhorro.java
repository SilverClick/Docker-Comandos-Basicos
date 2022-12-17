
package com.gonzalo.boletin16;

public class ContaAhorro extends Conta {
     private double intereseAnual;
    private double saldoMin = 1000;

    public ContaAhorro() {
    }

    public ContaAhorro(long numeroConta, Persoa cliente, double saldo, double intereseAnual) {
        super(numeroConta, cliente, saldo);
        this.intereseAnual = intereseAnual;
    }

    @Override
    public void actualizarSaldo() {
        if (super.getSaldo() >= saldoMin) {
            double saldo= super.getSaldo()- super.getSaldo()*(intereseAnual/100);
     
     super.setSaldo(saldo);
            
        }
    }
}
    


