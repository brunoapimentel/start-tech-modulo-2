package lista4.conta;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(double saldo) {
        super(saldo);
        chequeEspecial = saldo * 0.1;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public String toString() {
        return String.format(
            """
            %s
            Saldo: %.2f
            Cheque Especial: %.2f
            """,
            getNumero(), getSaldo(), chequeEspecial
        );
    }
}
