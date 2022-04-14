package com.gropp;

import com.gropp.domain.Endereco;
import com.gropp.domain.Gerente;
import com.gropp.domain.OperadorDeCaixa;
import com.gropp.domain.Vendedor;

public class Main {

    public static void main(String[] args) {
        // iniciando uma nova instancia e referenciando cada atributo em separadp
//        Endereco endereco = new Endereco();
//        endereco.setRua("Endereço para essa rua");
//        System.out.println(endereco.getRua());

        // chamando classe Endereco
        // iniciando a instancia utilizando o construtor com todos os atributos
        Endereco endereco =
                new Endereco("rua do funcionario", "complemento endereço funcionario", "bairro do funcionario");
        System.out.println(endereco);
        System.out.println("------");

        // chamando classe Vendedor atraves do construtor default
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Fernando Gropp");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        // chama o metodo calcula bonificacao e passa o percentual double
        vendedor.calculaBonificacao(2.0);
        vendedor.setEndereco(endereco);
        System.out.println(vendedor);
        System.out.println("-------");

        // chamando classe OperadorDeCaixa atraves do construtor declarado na classe
        OperadorDeCaixa operadorCaixa =
                new OperadorDeCaixa("João da Silva", "789.456.123-00", 2000d, endereco, 100d);
        System.out.println(operadorCaixa);
        System.out.println("-----------");

        // chamando classe Gerente atraves do construtor default
        Gerente gerente = new Gerente();
        gerente.setNome("Gerencio da Silva");
        gerente.setDocumento("321654987-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        // chama o metodo para calcular a remuneracao
        gerente.calculaRemuneracao();
        // chama o metodo para calcular a bonificacao
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);
        System.out.println("------");

    }
}