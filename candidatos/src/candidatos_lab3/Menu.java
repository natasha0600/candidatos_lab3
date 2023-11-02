package candidatos_lab3;

import javax.swing.*;
import java.util.Scanner;

public class Menu {
    public static void menu(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Adicionar candidatos ");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Remover um candidato");
            System.out.println("4.Sair");

            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Deve ser preenchido: \n Nome, Partido, Idade, Numero de votos. ");
                    System.out.println("Digite as informaçoes do candidato: ");

            }







        }






    }
}
