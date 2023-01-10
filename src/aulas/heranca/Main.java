package aulas.heranca;

public class Main {
    public static void main(String[] args) {
        Raposa raposa = new Raposa("Tails", "2 caudas");

        System.out.println(raposa.emitirSom());
        System.out.println(raposa.getNome());
        System.out.println(raposa.getRaca());

        Animal animal = new Animal("Animal", "Muppet");
        System.out.println(animal.emitirSom());
    }
}