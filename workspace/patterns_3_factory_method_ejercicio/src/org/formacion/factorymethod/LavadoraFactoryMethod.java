/**
 * 
 */
package org.formacion.factorymethod;

/**
 * @author usuario
 *
 */
public abstract class LavadoraFactoryMethod {

	public Lavadora crearLavadora() {
		Lavadora lavadora = hacerLavadora();
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		return lavadora;
	}

	protected abstract Lavadora hacerLavadora();

}
