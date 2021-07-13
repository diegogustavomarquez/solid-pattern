package org.formacion.factorymethod;

public class LavadoraSuperiorFactoryMethod extends LavadoraFactoryMethod {

	@Override
	public Lavadora hacerLavadora() {
		return new LavadoraCargaSuperior();
	}

}
