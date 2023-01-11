package lista4;

import lista4.conta.Conta;
import lista4.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = Interface.criarPessoa();
        Conta conta = Interface.criarConta();

        pessoa.setConta(conta);

        Interface.imprimirResumo(pessoa);
    }
}
