package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionPrecioMayor implements Condiciones{

	private double precioBuscar;
	
	
	public condicionPrecioMayor(double precioBuscar) {
		super();
		this.precioBuscar = precioBuscar;
	}


	@Override
	public boolean cumpleCondicion(Elemento e) {
		return e.getPrecio()>precioBuscar;
	}

}
