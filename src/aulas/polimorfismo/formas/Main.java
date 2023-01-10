package aulas.polimorfismo.formas;

public class Main {
    public static void main(String[] args) {
        ConstrutorFormas construtorFormas = new ConstrutorFormas();
        Forma forma = construtorFormas.construir();

        System.out.println(forma.calcularArea());
    }
}
