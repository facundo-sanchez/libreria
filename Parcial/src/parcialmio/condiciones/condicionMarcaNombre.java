package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionMarcaNombre implements Condiciones {
	private String nombre;
	
	
	public condicionMarcaNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public boolean cumpleCondicion(Elemento e) {
		return e.getNombre().equals(nombre);
	}

}
