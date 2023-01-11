package lista4.pessoa;

public class PessoaJuridica extends Pessoa {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;

    public PessoaJuridica(String nomeFantasia, String razaoSocial, String cnpj, String email) {
        super(email);

        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return String.format(
                """
                %s
                Razão Social: %s
                CNPJ: %s
                E-mail: %s
                """,
                nomeFantasia, razaoSocial, cnpj, getEmail()
        );
    }
}
