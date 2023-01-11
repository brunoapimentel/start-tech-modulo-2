package lista4.conta;

import java.util.Random;

public abstract class Conta {
    private final int TOTAL_DIGITOS = 5;
    private final int DIGITO_MAXIMO = 10;

    private String numero;
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
        gerarNumero();
    }

    private void gerarNumero() {
        Random random = new Random();

        numero = "";

        for(int i = 0; i < TOTAL_DIGITOS - 1; i++) {
            numero += random.nextInt(DIGITO_MAXIMO);
        }

        numero += "-";
        numero += random.nextInt(DIGITO_MAXIMO);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}
