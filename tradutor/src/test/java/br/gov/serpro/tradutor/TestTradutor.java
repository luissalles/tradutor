package br.gov.serpro.tradutor;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTradutor {
    @Test
    public void tradutorSemPalavras(){
    	Tradutor t = new Tradutor();
        assertTrue(t.estaVazio());
    }
}
