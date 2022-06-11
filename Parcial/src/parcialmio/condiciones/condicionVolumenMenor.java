package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionVolumenMenor implements Condiciones{

	private int volumenBuscar;
	
	
	public condicionVolumenMenor(int volumenBuscar) {
		super();
		this.volumenBuscar = volumenBuscar;
	}


	@Override
	public boolean cumpleCondicion(Elemento e) {
		return e.getVolumen() < volumenBuscar;
	}

}
