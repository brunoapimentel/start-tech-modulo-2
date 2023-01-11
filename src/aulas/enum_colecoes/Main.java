package aulas.enum_colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

// Explicação sobre coleções em Java
public class Main {
    public static void main(String[] args) {
        // A List é um vetor com tamanho flexível
        ArrayList<String> palavras = new ArrayList<>();

        palavras.add("Batata");
        palavras.add("Cebola");
        palavras.add("Amendoim");

        palavras.remove(1);

        for(String palavra: palavras) {
            System.out.println(palavra);
        }

        // O Map identifica seu conteúdo usando um paradigma de chave/valor
        HashMap<String, String> pessoa = new HashMap<>();
        pessoa.put("nome", "josé");
        pessoa.put("idade", "Dez");

        System.out.println(pessoa.get("nome"));

        //O Set é uma lista que não permite valores repetidos
        TreeSet<String> palavrasSemRepetir = new TreeSet<>();

        palavrasSemRepetir.add("Batata");
        palavrasSemRepetir.add("Cebola");
        palavrasSemRepetir.add("Amendoim");
        palavrasSemRepetir.add("Feijão");

        for (String palavra : palavrasSemRepetir){
            System.out.println(palavra);
        }
    }
}
