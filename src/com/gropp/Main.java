package com.gropp;

public class Main {

    public static void main(String[] args) {
        // iniciando uma nova instancia e referenciando cada atributo em separadp
//        Endereco endereco = new Endereco();
//        endereco.setRua("Endereço para essa rua");
//        System.out.println(endereco.getRua());

        // iniciando a instancia utilizando o construtor com todos os atributos
        Endereco endereco =
                new Endereco("rua do funcionario", "complemento endereço funcionario", "bairro do funcionario");
        System.out.println(endereco);
        System.out.println("------");

        // chamando atraves do construtor default
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Fernando Gropp");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        System.out.println(vendedor);
        System.out.println("-------");

        // chamando atraves do construtor declarado na classe
        OperadorDeCaixa operadorCaixa =
                new OperadorDeCaixa("João da Silva", "789.456.123-00", 2000d, endereco, 100d);
        System.out.println(operadorCaixa);
        System.out.println("-----------");
    }
}