package lista4.conta;

public class ContaPoupanca extends Conta {
    private final double RENDIMENTO = 0.05;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public double cacularRendimento() {
        return getSaldo() * RENDIMENTO;
    }

    @Override
    public String toString() {
        return String.format(
            """
            %s
            Saldo: %.2f
            Rendimento para o próximo mês: %.2f
            """,
            getNumero(), getSaldo(), cacularRendimento()
        );
    }
}
