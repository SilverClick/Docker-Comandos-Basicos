
package com.gonzalo.boletin16;


public class Conta {
     private long numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta(long numeroConta, Persoa cliente, double saldo) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public long getNumeroCuenta() {
        return numeroConta;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroConta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    public double Ingresar(double euros) {
        if (euros > 0) {
            saldo += euros;
        }
        return saldo;
    }
    
    public double Retirar(double euros) {
        if (euros > 0) {
            saldo -= euros;
        }
        return saldo;
    }

    public void actualizarSaldo() {
    }
    
    @Override
    public String toString() {
        return " numeroConta = " + numeroConta + "\n saldo = " + saldo + "\n  cliente = " + cliente;
    }

}

