package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionVolumenIgual implements Condiciones{
	private int volumenBuscar;

	public condicionVolumenIgual(int volumenBuscar) {
		super();
		this.volumenBuscar = volumenBuscar;
	}

	@Override
	public boolean cumpleCondicion(Elemento e) {
		return e.getVolumen() == volumenBuscar;
	}

}
