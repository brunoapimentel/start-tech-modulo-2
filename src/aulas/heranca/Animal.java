package aulas.heranca;

public class Animal {
    private String nome;
    private String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String emitirSom() {
        return "Eu não existo, logo não emito som :)";
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
}
