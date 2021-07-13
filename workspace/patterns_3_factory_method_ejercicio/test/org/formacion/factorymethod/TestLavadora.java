package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {

	@Test
	public void test_carga_frontal() {
		LavadoraFactoryMethod lavadoraFactoryMethod = new LavadoraFrontalFactoryMethod();
		Lavadora lavadora = lavadoraFactoryMethod.crearLavadora();

		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {

		LavadoraFactoryMethod lavadoraFactoryMethod = new LavadoraSuperiorFactoryMethod();
		Lavadora lavadora = lavadoraFactoryMethod.crearLavadora();

		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
