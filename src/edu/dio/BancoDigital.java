package edu.dio;

import edu.dio.banco.CartaoCredito;
import edu.dio.banco.Conta;
import edu.dio.banco.ContaCorrente;
import edu.dio.banco.ContaPoupanca;
import edu.dio.cliente.Cliente;
import edu.dio.cliente.Endereco;

public class BancoDigital {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente(
                456,
                2000, new Cliente("Marcelo",
                                        "Oliveira",
                                        "99446633",
                                        "marcelo@email.com",
                                        new Endereco("Java", 78, "045376-00"),
                                        "123456789-98"));

        Conta c2 = new ContaPoupanca(
                321,
                2000, new Cliente("Elaine",
                                        "Silva",
                                        "33669944",
                                        "elaine@email.com",
                                        new Endereco("Java", 78, "045376-00"),
                                        "987654321-98"));

        System.out.println("Saldo c1 inicial: R$ "+c1.getSaldo());
        c1.depositar(300);
        System.out.println("Saldo c1 após deposito: R$ "+c1.getSaldo());
        c1.sacar(200);
        System.out.println("Saldo c1 após saque: R$ "+c1.getSaldo());
        c1.transferir(100, c2);
        System.out.println("Saldo c1 após transferir: R$ "+c1.getSaldo());
        System.out.println("Saldo c2 após receber transferência: R$ "+c2.getSaldo());

        CartaoCredito c1Card = c1.emitirCartao();
        c1Card.setLimite(c1);
        System.out.println("Limite do cartão de crédito: R$ "+c1Card.getLimite());
        System.out.println("Número cartão: "+c1Card.getNumero());
        System.out.println("CVV: "+c1Card.getCvv());
        c1Card.aprovarCompra(500);
        c1Card.aprovarCompra(2000);

    }

}
