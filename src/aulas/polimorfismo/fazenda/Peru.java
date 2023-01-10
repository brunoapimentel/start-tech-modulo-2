package aulas.polimorfismo.fazenda;

public class Peru extends Animal {
    @Override
    public String falarNome() {
        return "Peruvaldo";
    }

    @Override
    public String falar() {
        return "Gluglubglub";
    }
}
