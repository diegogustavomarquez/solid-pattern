package org.formacion.ocp;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GeneradorPrimosOrdenInverso extends GeneradorPrimos {

	public List<Integer> primos(int limit) {
		return super.primos(limit).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

}
