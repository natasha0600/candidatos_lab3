package testes;

import candidatos_lab3.Candidato;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("\nBruno ", "Psol, ", 25, 456);
        Candidato candidato2 = new Candidato("\nMariana ", "PT, ", 19, 12649);
        Candidato candidato3 = new Candidato("\nErnesto ","Republicanos, ", 20, 8546);

        candidatos.add(candidato1);
        candidatos.add(candidato2);
        candidatos.add(candidato3);






        Scanner sc = new Scanner(System.in);
        boolean continuar = true;



        while (continuar) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1. Mostrar lista de candidatos");
            System.out.println("2. Candidato mais novo");
            System.out.println("3. Candidato mais velho");
            System.out.println("4. Candidato com mais votos ");
            System.out.println("5. Candidato com menos votos ");
            System.out.println("6.Sair");

            int opcao = sc.nextInt();



            switch (opcao) {
                case 1:
                    System.out.println("Lista de candidatos: ");
                    for (int i = 0; i < candidatos.size(); i++) {
                        System.out.println(candidatos.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("Candidato mais novo: ");
                    Candidato candidatoMaisNovo = Collections.min(candidatos, Comparator.comparingInt(Candidato::getIdade));
                    System.out.println(candidatoMaisNovo);
                    break;

                case 3:
                    System.out.println("Candidato mais velho: ");
                    Candidato candidatoMaisVelho = Collections.max(candidatos, Comparator.comparingInt(Candidato::getIdade));
                    System.out.println(candidatoMaisVelho);
                    break;

                case 4:
                    System.out.println("Candidato com mais votos: ");
                    Candidato candidatoComMaisVotos = Collections.max(candidatos, Comparator.comparingInt(Candidato::getNumVotos));
                    System.out.println(candidatoComMaisVotos);
                    break;

                case 5:
                    System.out.println("Candidato com menos votos ");
                    Candidato candidatoComMenosVotos = Collections.min(candidatos, Comparator.comparingInt(Candidato::getNumVotos));
                    System.out.println(candidatoComMenosVotos);
                    break;

            }


            // System.out.println("Tamanho "+candidatos.size());
           /* Comparator<Candidato>comparePorIdade = Comparator.comparing(t->t.getIdade());
            candidatos.sort(comparePorIdade);
            System.out.println("Candidatos mais novos, estão por Nome, Idade e n° de votos ");
            System.out.println("\n" +candidatos);
            */

        }
    }
}