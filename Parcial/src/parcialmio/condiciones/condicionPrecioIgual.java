package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionPrecioIgual implements Condiciones{
	private double precioBuscar;
	
	

	public condicionPrecioIgual(double precioBuscar) {
		super();
		this.precioBuscar = precioBuscar;
	}



	@Override
	public boolean cumpleCondicion(Elemento e) {
		return e.getPrecio() == precioBuscar;
	}

}
