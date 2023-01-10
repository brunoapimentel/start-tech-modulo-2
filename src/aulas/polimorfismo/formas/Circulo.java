package aulas.polimorfismo.formas;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getDiametro() {
        return raio * 2;
    }

    public double calcularCircunferencia() {
        return Math.PI * getDiametro();
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
