package calcular;

import static org.junit.Assert.*;


import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.SomaInteiros(2, 2));
	}
	
	@Test
	public void tresSomaSeteEsperaDez() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(3, 7)==10);
		
	}
	@Test
	public void quatroSomaSeteEsperaOnze() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(4, 7)==11);
		
	}

	@Test
	public void  tresMultTresEsperaNove() {
		Calculadora c = new Calculadora();
		assertEquals(9, c.multiInt(3, 3));
	}
	@Test
	public void  cincoMultCincoEsperaVinteECinco() {
		Calculadora c = new Calculadora();
		assertEquals(25, c.multiInt(5, 5));
	}
	@Test
	public void  doisMultDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.multiInt(2, 2));
	}
	@Test
	public void tresDivTresEsperaUm() {
		Calculadora c = new Calculadora();
		assertEquals(1, c.divInt(3, 3));
	}
	@Test
	public void dezDivCincoEsperaDois() {
		Calculadora c = new Calculadora();
		assertEquals(2, c.divInt(10, 5));
	}
	@Test
	public void seisDivTresEsperaDois() {
		Calculadora c = new Calculadora();
		assertEquals(1, c.divInt(3, 3));
	}
	@Test
	public void dezSubDezEsperaZero() {
		Calculadora c = new Calculadora();
		assertTrue(c.subInt(10, 10)==0);
}
	@Test
	public void cemSubCinquentaEsperaCinquenta() {
		Calculadora c = new Calculadora();
		assertTrue(c.subInt(100, 50)==50);
}
	@Test
	public void seteSubDoisEsperaCinco() {
		Calculadora c = new Calculadora();
		assertTrue(c.subInt(7, 2)==5);
}
}
