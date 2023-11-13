package candidatos_lab3;

import candidatos_lab3.Candidato;
import candidatos_lab3.Util;
import java.util.*;

public class CandidatosMain {
    public static void main(String[] args) {
        List<Candidato> candidatos = Util.getCandidatos();

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            Util.menu();

            int opcao = sc.nextInt();
            int totalDeVotos = 0;
            double mediaDeVotos = 0.0;

            switch (opcao) {
                case 1 -> Util.listaCandidatos(candidatos);
                case 2 -> Util.candidatoMaisNovo(candidatos);
                case 3 -> Util.candidatoMaisVelho(candidatos);
                case 4 -> Util.candidatoComMaisVotos(candidatos);
                case 5 -> Util.candidatoComMenosVotos(candidatos);
                case 6 -> Util.totalDeVotos(candidatos, totalDeVotos);
                case 7 -> Util.mediaDeVotos(candidatos, totalDeVotos, mediaDeVotos);
                case 8 -> continuar = Util.sairDoSistema();
            }
        }sc.close();
    }


}