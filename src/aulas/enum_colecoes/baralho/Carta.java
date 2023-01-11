package aulas.enum_colecoes.baralho;

public class Carta {
    Naipe naipe;
    Rank rank;

    public Carta(Rank rank, Naipe naipe) {
        this.naipe = naipe;
        this.rank = rank;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", rank, naipe);
    }
}
