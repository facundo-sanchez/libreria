package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionPrecioMenor implements Condiciones{
	private double precioBuscar;
	
	
	public condicionPrecioMenor(double precioBuscar) {
		super();
		this.precioBuscar = precioBuscar;
	}


	@Override
	public boolean cumpleCondicion(Elemento e) {
		return e.getPrecio()<precioBuscar;
	}

}
