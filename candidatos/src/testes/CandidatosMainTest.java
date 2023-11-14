package testes;

import candidatos_lab3.Candidato;
import candidatos_lab3.Util;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandidatosMainTest {
    @Test
    public void testCandidatoComMenosVotos(){
        assertEquals("Nome: Bruno ,Partido: Psol ,Idade: 25, Numero de votos: 456",Util.candidatoComMenosVotos(Util.getCandidatos()));
    }
    @Test
    public void testCandidatosComMaisVotos(){
        assertEquals("Nome: Mariana ,Partido: PT ,Idade: 19, Numero de votos: 12649",Util.candidatoComMaisVotos(Util.getCandidatos()));
    }
    @Test
    public void testCandidatoMaisVelho(){
        assertEquals("Nome: Natasha,Partido: PSDB,Idade: 70, Numero de votos: 8000",Util.candidatoMaisVelho(Util.getCandidatos()));
    }
    @Test
    public void testCandidatoMaisNovo(){
        assertEquals("Nome: Mariana ,Partido: PT ,Idade: 19, Numero de votos: 12649",Util.candidatoMaisNovo(Util.getCandidatos()));
    }
}
