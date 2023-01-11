package aulas.enum_colecoes.baralho;

import java.util.ArrayList;

public class Baralho {
    ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho() {
        for(Naipe naipe : Naipe.values()) {
            for (Rank rank : Rank.values()) {
                cartas.add(new Carta(rank, naipe));
            }
        }
    }

    @Override
    public String toString() {
        String string = "";

        for(Carta carta : cartas) {
            string += carta;
            string += "\n";
        }

        return string;
    }

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println(baralho);
    }
}
