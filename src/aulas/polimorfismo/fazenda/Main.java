package aulas.polimorfismo.fazenda;

public class Main {
    public static void main(String[] args) {
        Animal animal = Fazenda.buscarAnimal();

        System.out.println(animal.falarNome());
        System.out.println(animal.falar());
    }
}
