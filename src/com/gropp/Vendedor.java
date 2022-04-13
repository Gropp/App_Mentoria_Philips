package com.gropp;
/* essa classe é filha da classe funcionario CLT
   ela herda os metodos da classe pai
   vendedor é uma extensao de funcionarios clt */
public class Vendedor extends FuncionarioCLT {
    //atributos unicos do filho
    private double valorDaBonificacao;

    //aqui vamos usar do construtor vazio

    //formata a saida desta classe
    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", salario=" + valorSalario +
                ", endereco=" + endereco + //.getRua() +
                ", Bonificacao=" + valorDaBonificacao +
                '}';
    }
}
