package org.formacion.command;

public class TratamientoPedidoInternacional implements TratamientoPedido {

	private PedidoInternacional pedidoInternacional;

	public TratamientoPedidoInternacional(PedidoInternacional pedidoInternacional) {
		this.pedidoInternacional = pedidoInternacional;
	}

	@Override
	public boolean tratar() {
		return "Mordor".equalsIgnoreCase(pedidoInternacional.getDestino()) ? false : true;
	}

}
