package aulas.polimorfismo.fazenda;

import java.util.Random;

public class Fazenda {

    public static Animal buscarAnimal() {
        Random random = new Random();
        int sorteio = random.nextInt(4);

        if(sorteio == 0) {
            return new Boi();
        }

        if (sorteio == 1) {
            return new Porco();
        }

        if (sorteio == 2) {
            return new Peru();
        }

        if (sorteio == 3) {
            return new Hiena();
        }

        throw new RuntimeException("Animal inexistente");
    }
}
