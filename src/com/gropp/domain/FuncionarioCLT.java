package com.gropp.domain;

/* Classes abstracts só funcionam para HERANCA */
public abstract class FuncionarioCLT {
    /* atributos Protect - para que as classes filhas tenham acesso direto a esses atributos */
    protected String nome;
    protected String documento;
    protected Double valorSalario;
    protected Endereco endereco;

    /* Construtor default vazio */
    public FuncionarioCLT() {
    }

    /* Construtor declarando os atributos */
    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.endereco = endereco;
    }

    /* Getters e Setters */

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

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // formata a saida da classe para nao ir um endereco de memoria
    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                '}';
    }
}
