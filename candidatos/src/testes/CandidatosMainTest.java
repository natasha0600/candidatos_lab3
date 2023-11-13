package testes;

import candidatos_lab3.Candidato;
import candidatos_lab3.Util;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandidatosMainTest {
    @Test
    public void test(){
        assertEquals("Nome: Bruno ,Partido: Psol ,Idade: 25, Numero de votos: 456",Util.candidatoComMenosVotos(Util.getCandidatos()));
    }
}
