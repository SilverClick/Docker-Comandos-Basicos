
package com.gonzalo.boletin_extra_2;

  
public class Conta {
  



    private String nomeCliente;
    private String numConta;
    private double tipoInterese;
    private double saldo;

    public Conta(){}
    public Conta(String clien,String numc,double tipo,double sal){
        nomeCliente=clien;
        numConta=numc;
        tipoInterese=tipo;
        saldo=sal;
    }

   
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public void setTipoInterese(double tipoInteres) {
        this.tipoInterese = tipoInteres;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getNumConta() {
        return numConta;
    }
    public double getTipoInterese() {
        return tipoInterese;
    }
    public double getSaldo() {
        return saldo;
    }

    //Metodos

    public void ingreso(double ingres){
        saldo+=Math.abs(ingres);
    }

    public void reintegro(double rein){
        saldo-=Math.abs(rein);
    }

    public void transferencia(Conta cnt,double impor){
        cnt.ingreso(impor);
        saldo-=Math.abs(impor);
    }
}

