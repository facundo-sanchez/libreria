package parcialmio.libreria;

import java.util.List;

import parcialmio.condiciones.Condiciones;

public abstract class Elemento {
	
	private String nombre;

	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the precio
	 */
	public abstract double getPrecio();

	/**
	 * @return the volumen
	 */
	public abstract int getVolumen();
	
	public abstract int calcularNumProductos();
	
	public abstract List<Elemento> buscarElemento(Condiciones cond);
	

	@Override
	public String toString() {
		return "Nombre: " + nombre;
	}
	
	
	

}
