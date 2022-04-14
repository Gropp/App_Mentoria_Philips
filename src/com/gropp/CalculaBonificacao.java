package com.gropp;

// essa interface serve para calcular a bonificacao, uma vez que o gerente e o vendedor, um filho da classe PJ
// e outro filho da classe CLT, sao de classes diferentes e nao tem pai em comum, mas tem a bonificacao em comum
// polimorfismo - todos os metodos da interface SAO PUBLIC POR DEFAULT e  abstract tambem, NAO  PODEMOS INSTANCIAR
// UMA INTERFACE - new interface é PROIBIDO, entao o abstract é defoult public abstract Interface{...}
public interface CalculaBonificacao {
    void calculaBonificacao(Double porcentagemBonificacao);
}
