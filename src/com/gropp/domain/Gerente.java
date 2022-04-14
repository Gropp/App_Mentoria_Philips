package com.gropp.domain;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao{
    // atributo do gerente
    private Double valorBonificacao;

    // implementacao da interface calcula bonificacao
    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        // a regra do gerente é um percentual da remuneracao mais 100,00
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
    }

    // formatamos a saida desta classe
    // se vc chamar o toString ele nao vai trazer informacoes do FuncionarioPJ, pois os atributos de Funcionario
    // PJ sao do tipo private - entao tem que fazer um toString dentro da classe pai e copia para aqui
    // e coloca o super para referenciar a classe pai
    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneração=" + super.getValorRemuneracao() +
                // valor bonificação é um atributo desta classe
                ", valorBonificação=" + this.valorBonificacao +
                '}';
    }
}
