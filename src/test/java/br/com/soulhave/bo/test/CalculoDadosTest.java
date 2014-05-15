package br.com.soulhave.bo.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import br.com.soulhave.bo.CalculoDados;

public class CalculoDadosTest {

	@Test
	public void somaDadosNormal() throws Exception {
		int a = 10;
		int b = 2;
		Integer c = 12;
		assertEquals(new CalculoDados().somaDados(a, b),c);
	}
	@Test
	public void multiplicarNormal() throws Exception {
		int a = 10;
		int b = 2;
		Integer c = 20;
		assertEquals(new CalculoDados().multiplicar(a, b),c);
	}
	@Test
	public void somaDadosNegativo() {
		Integer a = -1;
		Integer b = 2;
		Integer c = 1;
		assertEquals((new CalculoDados()).somaDados(a, b), c);
	}
	@Test
	public void somaDadosNull() {
		Integer a = null;
		Integer b = null;
		assertNull((new CalculoDados()).somaDados(a, b));
	}
	@Test
	public void multiplicaNull() {
		Integer a = null;
		Integer b = null;
		assertNull((new CalculoDados()).multiplicar(a, b));
	}
	@Test
	public void somaDadosParamANull() {
		Integer a = null;
		Integer b = 5;
		assertNull((new CalculoDados()).somaDados(a, b));
	}
	@Test
	public void somaDadosParamBNull() {
		Integer a = 3;
		Integer b = null;
		assertNull((new CalculoDados()).somaDados(a, b));
	}
}
