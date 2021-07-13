package org.formacion.abstractfactory;

public class IdiomaEnFactory implements IdiomaAbstractFactoy {

	@Override
	public Preguntas crearPregunta() {
		return new PreguntasEn();
	}

	@Override
	public Saludos crearSaludos() {
		return new SaludosEn();
	}

}
