package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionVolumenMayor implements Condiciones {

	private int volumenBuscar;

	public condicionVolumenMayor(int volumenBuscar) {
		super();
		this.volumenBuscar = volumenBuscar;
	}

	@Override
	public boolean cumpleCondicion(Elemento e) {
		return e.getVolumen() > volumenBuscar;
	}

}
