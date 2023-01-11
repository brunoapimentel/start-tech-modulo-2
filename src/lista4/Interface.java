package lista4;

import lista4.conta.Conta;
import lista4.conta.ContaCorrente;
import lista4.conta.ContaPoupanca;
import lista4.pessoa.Pessoa;
import lista4.pessoa.PessoaFisica;
import lista4.pessoa.PessoaJuridica;
import utils.Leitor;

public class Interface {
    private static Leitor leitor = new Leitor();

    public static Pessoa criarPessoa() {
        int escolha = leitor.lerInteiro(
            """
            Escolha uma opção:
            1- Pessoa Física
            2- Pessoa Jurídica
            """
        );

        if(escolha == 1) {
            return criarPessoaFisica();
        }

        if(escolha == 2) {
            return criarPessoaJuridica();
        }

        throw new RuntimeException("Opção inválida");
    }

    private static PessoaFisica criarPessoaFisica() {
        String nome = leitor.lerString("Digite o nome: ");
        String cpf = leitor.lerString("Digite o cpf: ");
        String telefone = leitor.lerString("Digite o telefone: ");
        String email = leitor.lerString("Digite o e-mail: ");

        return new PessoaFisica(nome, cpf, telefone, email);
    }

    private static PessoaJuridica criarPessoaJuridica() {
        String nomeFantasia = leitor.lerString("Digite o nome fantasia: ");
        String razaoSocial = leitor.lerString("Digite a razão social: ");
        String cnpj = leitor.lerString("Digite o CNPJ: ");
        String email = leitor.lerString("Digite o e-mail: ");

        return new PessoaJuridica(nomeFantasia, razaoSocial, cnpj, email);
    }


    public static Conta criarConta() {
        int escolha = leitor.lerInteiro(
            """
            Escolha uma opção:
            1- Conta Corrente
            2- Conta Poupança
            """
        );

        if(escolha != 1 && escolha != 2) {
            throw new RuntimeException("Opção inválida");
        }

        double saldo = leitor.lerDecimal("Digite o valor do depósito inicial: ");

        if(escolha == 1) {
            return new ContaCorrente(saldo);
        } else {
            return new ContaPoupanca(saldo);
        }
    }

    public static void imprimirResumo(Pessoa pessoa) {
        System.out.println(pessoa);
        System.out.println(pessoa.getConta());
    }
}
