package aulas.polimorfismo.fazenda;

public class Boi extends Animal {
    public String dormir() {
        return "zzzz";
    }

    @Override
    public String falarNome() {
        return "Matoso";
    }

    @Override
    public String falar() {
        return "Mooooooooo";
    }
}
