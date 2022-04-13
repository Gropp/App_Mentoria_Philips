package com.gropp;

public class OperadorDeCaixa extends FuncionarioCLT {
    private final double quebraDeCaixa;
    // constructor herdado de FuncionarioCLT (classe pai)
    // o super é para inicar que as variaveis vem da classe pai
    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco, double quebraDeCaixa) {
        super(nome, documento, valorSalario, endereco);
        this.quebraDeCaixa = quebraDeCaixa;
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", salario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", quebradecaixa=" + quebraDeCaixa +
                '}';
    }
}
