package aulas.polimorfismo.formas;

import utils.Leitor;

public class ConstrutorFormas {
    public Forma construir() {
        double[] lados = obterLados();

        if(lados.length == 1) {
            return new Circulo(lados[0]);
        }

        if(lados.length == 2) {
            return new Retangulo(lados[0], lados[1]);
        }

        throw new RuntimeException("Não temos aulas.polimorfismo.formas com essa quantidade de lados :(");
    }

    private double[] obterLados() {
        Leitor leitor = new Leitor();

        String ladosString = leitor.lerString("Digite os lados: ");
        String[] ladosVetor = ladosString.split(" ");
        double[] lados = new double[ladosVetor.length];

        for(int i = 0; i < lados.length; i++) {
            lados[i] = Double.parseDouble(ladosVetor[i]);
        }

        return lados;
    }
}
