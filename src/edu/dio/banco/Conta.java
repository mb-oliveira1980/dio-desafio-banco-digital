package edu.dio.banco;

import edu.dio.cliente.Cliente;

import java.util.Random;

public abstract class Conta {
    Random random = new Random();

    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int agencia, double saldo, Cliente cliente) {
        this.numero = random.nextInt(100);
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. Operação não realizada.");
        }
    }

    public void depositar(double valor){
        if(valor != 0){
            this.saldo += valor;
        } else {
            System.out.println("Valor digitado esta incorreto. Operação não realizada.");
        }
    }

    public void transferir(double valor, Conta destino){
        if (valor <= this.saldo && valor != 0){
            this.saldo -= valor;
            destino.saldo += valor;
        } else {
            System.out.println("Operação não realizada.");
            System.out.println("Por favor verifique o valor digitado ou se há saldo suficiente.");
        }
    }
}
