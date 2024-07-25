package edu.dio.banco;

import edu.dio.cliente.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, double saldo, Cliente cliente) {
        super(agencia, saldo, cliente);
    }

    public CartaoCredito emitirCartao(){
        CartaoCredito novoCartao = new CartaoCredito("24/07/24", "Mastercard");
        return novoCartao;
    }


}
