package testes;

import candidatos_lab3.Candidato;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("\nBruno ", "Psol", 25, 456);
        Candidato candidato2 = new Candidato("\nMariana ", "PT", 75, 12649);

        candidatos.add(candidato1);
        candidatos.add(candidato2);


        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1. Mostrar lista de candidatos");
            System.out.println("2. Candidatos com mais votos");
            System.out.println("3. Candidatos com menos votos");
            System.out.println("4.Candidatos mais velhos");
            System.out.println("5.Candidatos mais novos");
            System.out.println("6.Sair");

            int opcao = sc.nextInt();



            switch (opcao) {
                case 1:
                    for (int i = 0; i < candidatos.size(); i++) {
                        System.out.println(candidatos.get(i).toString());
                    }
                    break;
                case 2:

            }


            // System.out.println("Tamanho "+candidatos.size());
        }
    }
}