package br.gov.serpro.tradutor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestTradutor {
	private Tradutor t;
	
	@Before
	public void criarTradutor() {
    	t = new Tradutor();
	}
	
    @Test
    public void tradutorSemPalavras(){
        assertTrue(t.estaVazio());
    }
    
    @Test
    public void umaTraducao() {
    	t.adicionaTraducao("bom", "good");
    	assertFalse(t.estaVazio());
    	assertEquals("good", t.traduzir("bom"));
    }

    @Test
    public void duasTraducoes() {
    	t.adicionaTraducao("bom", "good");
    	t.adicionaTraducao("mau", "bad");
    	assertEquals("good", t.traduzir("bom"));
    	assertEquals("bad", t.traduzir("mau"));
    }
}
