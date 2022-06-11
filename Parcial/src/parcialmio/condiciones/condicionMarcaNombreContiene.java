package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionMarcaNombreContiene implements Condiciones{

	private String nombreBuscar;
	
	
	public condicionMarcaNombreContiene(String nombre) {
		this.nombreBuscar = nombre;
	}


	@Override
	public boolean cumpleCondicion(Elemento e) {
		return e.getNombre().contains(nombreBuscar);
	}

}
