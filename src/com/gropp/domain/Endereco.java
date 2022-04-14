package com.gropp.domain;
// dados sobre o endereco dos funcionarios
public class Endereco {
    /* atributos da classe endereco - o que faz parte do endereco
    // os atributos sao privados, ou seja, somente metodos dentro da classe podem acessa-los
    // para leitura e escrita */
    private String rua;
    private String complemento;
    private String bairro;

    // construtores - eles iniciam os objetos, o construtor vazio é criado por default
    public Endereco() {
    }

    // construtor com todos os atributos
    public Endereco(String rua, String complemento, String bairro) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    // para manipular os atributos é preciso criar os getters e setters
    // getters - pegam e setters - modificam
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

//  corrigindo a saida para mostrar o conteudo e nao o endereco da variavel
    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
