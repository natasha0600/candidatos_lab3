package candidatos_lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Util {
    public static void menu() {
        System.out.println("\nEscolha uma opção: ");
        System.out.println("1. Mostrar lista de candidatos");
        System.out.println("2. Mostrar candidato mais novo");
        System.out.println("3. Mostrar candidato mais velho");
        System.out.println("4. Mostrar candidato com mais votos ");
        System.out.println("5. Mostrar candidato com menos votos ");
        System.out.println("6. Mostrar soma de todos os votos ");
        System.out.println("7. Mostrar média de votação recebida pelos candidatos ");
        System.out.println("8. Sair do sistema");
    }

    public static List<Candidato> getCandidatos() {
        List<Candidato> candidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("Bruno ", "Psol ", 25, 456);
        Candidato candidato2 = new Candidato("Mariana ", "PT ", 19, 12649);
        Candidato candidato3 = new Candidato("Ernesto ", "Republicanos ", 20, 8546);
        Candidato candidato4 = new Candidato("Natasha", "PSDB", 70, 8000);

        candidatos.add(candidato1);
        candidatos.add(candidato2);
        candidatos.add(candidato3);
        candidatos.add(candidato4);
        return candidatos;
    }

    public static boolean sairDoSistema() {
        boolean continuar;
        System.out.println("Saindo do sistema...");
        continuar = false;
        return continuar;
    }

    public static void mediaDeVotos(List<Candidato> candidatos, int totalDeVotos, double mediaDeVotos) {
        System.out.println("Esta foi a média de votação dos candidatos: ");
        for (int i = 0; i < candidatos.size(); i++) {
            totalDeVotos = candidatos.get(i).getNumVotos() + totalDeVotos;
            mediaDeVotos = totalDeVotos / candidatos.size();
        }
        System.out.printf("Média de votação recebida pelos candidatos: %.2f", mediaDeVotos);
    }

    public static void totalDeVotos(List<Candidato> candidatos, int totalDeVotos) {
        System.out.println("Esta foi a soma de todos os votos: ");
        for (int i = 0; i < candidatos.size(); i++) {
            totalDeVotos = candidatos.get(i).getNumVotos() + totalDeVotos;
        }
        System.out.println(totalDeVotos);
    }

    public static String candidatoComMenosVotos(List<Candidato> candidatos) {
        System.out.println("Candidato com menos votos: ");
        Candidato candidatoComMenosVotos = Collections.min(candidatos, Comparator.comparingInt(Candidato::getNumVotos));
        System.out.println(candidatoComMenosVotos);
        return candidatoComMenosVotos.toString();
    }

    public static void candidatoComMaisVotos(List<Candidato> candidatos) {
        System.out.println("Candidato com mais votos: ");
        Candidato candidatoComMaisVotos = Collections.max(candidatos, Comparator.comparingInt(Candidato::getNumVotos));
        System.out.println(candidatoComMaisVotos);
    }

    public static void candidatoMaisVelho(List<Candidato> candidatos) {
        System.out.println("Candidato mais velho: ");
        Candidato candidatoMaisVelho = Collections.max(candidatos, Comparator.comparingInt(Candidato::getIdade));
        System.out.println(candidatoMaisVelho);
    }

    public static void candidatoMaisNovo(List<Candidato> candidatos) {
        System.out.println("Candidato mais novo: ");
        Candidato candidatoMaisNovo = Collections.min(candidatos, Comparator.comparingInt(Candidato::getIdade));
        System.out.println(candidatoMaisNovo);
    }

    public static void listaCandidatos(List<Candidato> candidatos) {
        System.out.println("Lista de candidatos: ");
        for (int i = 0; i < candidatos.size(); i++) {
            System.out.println(candidatos.get(i).toString());
        }
    }
}
