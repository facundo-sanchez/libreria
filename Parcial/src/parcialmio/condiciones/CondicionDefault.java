package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class CondicionDefault implements Condiciones {

	@Override
	public boolean cumpleCondicion(Elemento e) {
		return true;
	}

}
