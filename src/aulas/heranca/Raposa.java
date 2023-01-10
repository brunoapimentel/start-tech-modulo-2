package aulas.heranca;

public class Raposa extends Animal {
    public Raposa(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String emitirSom() {
        return "What does the fox say?";
    }
}
