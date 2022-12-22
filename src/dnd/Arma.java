package dnd;

public class Arma {
    private String nome;
    private int precisao;
    private int dano;

    public Arma(String nome, int precisao, int dano) {
        this.nome = nome;
        this.precisao = precisao;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getPrecisao() {
        return precisao;
    }

    public int getDano() {
        return dano;
    }
}
