package org.formacion.abstractfactory;

public class IdiomaEsFactory implements IdiomaAbstractFactoy {

	@Override
	public Preguntas crearPregunta() {
		return new PreguntasEs();
	}

	@Override
	public Saludos crearSaludos() {
		return new SaludosEs();
	}

}
