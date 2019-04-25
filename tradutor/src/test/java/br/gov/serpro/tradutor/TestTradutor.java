package br.gov.serpro.tradutor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTradutor {
    @Test
    public void tradutorSemPalavras(){
    	Tradutor t = new Tradutor();
        assertTrue(t.estaVazio());
    }
    
    @Test
    public void umaTraducao() {
    	Tradutor t = new Tradutor();
    	t.adicionaTraducao("bom", "good");
    	assertFalse(t.estaVazio());
    	assertEquals("good", t.traduzir("bom"));
    }

    @Test
    public void duasTraducoes() {
    	Tradutor t = new Tradutor();
    	t.adicionaTraducao("bom", "good");
    	t.adicionaTraducao("mau", "bad");
    	assertEquals("good", t.traduzir("bom"));
    	assertEquals("bad", t.traduzir("mau"));
    }
}
