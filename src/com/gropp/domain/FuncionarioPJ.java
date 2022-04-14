package com.gropp.domain;

// classe abstrata - so ira fazer heranca por isso abstract
public abstract class FuncionarioPJ {
    // atributos
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorHora;
    private Double valorRemuneracao;

    // vai usar somente o construtor default

    // metodos - funcoes das classes - coisas que elas fazem
    // valor da Remuneracao PJ
    public void calculaRemuneracao(){
        this.valorRemuneracao = this.valorHora * this.horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    // como o campo valor de remuneracao é calcula, ele nao pode ser acessivel para ser mudado sem que seja pelo calculo.
    /* public void setValorRemuneracao(Double valorRemuneracao) {
         this.valorRemuneracao = valorRemuneracao;
    }*/

    // como as variaveis (atributos) sao private nesta classe, precisamos exporta-los atraves do toString e
    // copiar para a classe filha.
//    @Override
//    public String toString() {
//        return "FuncionarioPJ{" +
//                "nome='" + nome + '\'' +
//                ", documento='" + documento + '\'' +
//                ", endereco=" + endereco +
//                ", horasTrabalhadas=" + horasTrabalhadas +
//                ", valorHora=" + valorHora +
//                ", valorRemuneracao=" + valorRemuneracao +
//                '}';
//    }
}
