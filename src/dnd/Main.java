package dnd;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem(
            "Jogador",
            10,
            new Arma("Espada", 2, 8),
            2
        );

        Personagem orc = new Personagem(
            "Orc",
            8,
            new Arma("Machado", 0, 12),
            0
        );

        while(orc.estaVivo() && jogador.estaVivo()) {
            System.out.println("\nUma nova rodada inicia.");
            jogador.atacar(orc);

            if(orc.estaVivo()) {
                orc.atacar(jogador);
            }
        }

        if(jogador.estaVivo()) {
            System.out.printf("%s morreu.\n", orc.getNome());
        } else {
            System.out.printf("%s morreu.\n", jogador.getNome());
        }
    }
}