package com.gropp;
/* essa classe é filha da classe funcionario CLT
   ela herda os metodos da classe pai
   vendedor é uma extensao de funcionarios clt */
// o implements se referencia a interface criada para calcular a bonificacao e que precisa ser
// acessada pela classe vendedor
public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{
    //atributos unicos do filho
    private double valorDaBonificacao;

    //aqui vamos usar do construtor vazio

    // acesso a interface - a classe que acessa ela tem que fazer a funcao
    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

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
