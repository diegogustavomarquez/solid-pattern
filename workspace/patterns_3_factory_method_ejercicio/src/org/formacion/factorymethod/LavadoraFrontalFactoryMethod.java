/**
 * 
 */
package org.formacion.factorymethod;

/**
 * @author usuario
 *
 */
public class LavadoraFrontalFactoryMethod extends LavadoraFactoryMethod {

	@Override
	public Lavadora hacerLavadora() {
		return new LavadoraCargaFrontal();
	}

}
