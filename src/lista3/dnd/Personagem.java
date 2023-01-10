package lista3.dnd;

import java.util.Random;

public class Personagem {
    private String nome;
    private int pontosDeVida;
    private Arma arma;
    private int defesa;

    private Random dado = new Random();

    public Personagem(String nome, int pontosDeVida, Arma arma, int defesa) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.arma = arma;
        this.defesa = defesa + 10;

        System.out.printf("O %s entrou no jogo e tem %s de hp.\n", nome, pontosDeVida);
    }

    public void atacar(Personagem orc) {
        int ataque = dado.nextInt(1, 21) + arma.getPrecisao();
        System.out.printf("O %s ataca com %s (%d).\n", nome, arma.getNome(), ataque);

        if(ataque >= orc.getDefesa()) {
            System.out.printf("O ataque acertou!\n");
            int dano = dado.nextInt(1, arma.getDano() + 1);
            orc.receberDano(dano);
        } else {
            System.out.println("O ataque errou!\n");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public void receberDano(int dano) {
        pontosDeVida -= dano;

        if(pontosDeVida < 0) {
            pontosDeVida = 0;
        }

        System.out.printf("%s recebeu %d de dano e tem %d de hp.\n", nome, dano, pontosDeVida);
    }

    public boolean estaVivo() {
        if(pontosDeVida > 0) {
            return true;
        } else {
            return false;
        }
    }

}
