package edu.dio.banco;

import java.util.Random;

public class CartaoCredito {
    Random random = new Random();

    private long numero;
    private int cvv;
    private String dataEmissao;
    private String bandeira;
    private double limite;

    public CartaoCredito(String dataEmissao, String bandeira) {
        this.numero = random.nextInt(400);
        this.cvv = random.nextInt(100);
        this.dataEmissao = dataEmissao;
        this.bandeira = bandeira;
    }

    public long getNumero() {
        return numero;
    }

    public int getCvv() {
        return cvv;
    }


    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(ContaCorrente conta) {
        this.limite = conta.getSaldo() * 0.50;
    }

    public void aprovarCompra(double valor){
        if (valor <= this.limite) {
            this.limite -= valor;
            System.out.println("Compra APROVADA parabéns!");
        }else{
            System.out.println("Compra NEGADA. Saldo insuficiente.");
        }
    }
}
