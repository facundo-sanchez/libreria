package parcialmio.libreria;

import java.util.ArrayList;
import java.util.List;

import parcialmio.condiciones.Condiciones;


public class Paquete extends Elemento {

	private List<Elemento> paquetes;
	private double precio;
	private int volumen;

	public Paquete(String nombre) {
		super(nombre);
		this.paquetes = new ArrayList<Elemento>();
	}

	/**
	 * @return the paquetes
	 */
	public List<Elemento> getPaquetes() {
		return new ArrayList<Elemento>(paquetes);
	}

	@Override
	public double getPrecio() {
		double precio = 0;
		for (Elemento elemento : paquetes) {
			precio += elemento.getPrecio();
		}
		return precio;
	}

	@Override
	public int getVolumen() {
		int volumen = 0;
		for (Elemento elemento : paquetes) {
			volumen += elemento.getVolumen();
		}
		return volumen;
	}


	@Override
	public int calcularNumProductos() {
		int contador = 0;
		for (Elemento elemento : paquetes) {
			contador += elemento.calcularNumProductos();
		}
		return contador;
	}
	
	public List<Elemento> buscarElemento(Condiciones condicion) {
		List<Elemento> resultados = new ArrayList<Elemento>();
		
		if(condicion.cumpleCondicion(this)) {
			resultados.add(this);
		}
		
		for (Elemento e : paquetes) {
			resultados.addAll(e.buscarElemento(condicion));
		}
		return resultados;
	}
	
	public void agregarElemento(Elemento e) {
		this.paquetes.add(e);
	}

	@Override
	public String toString() {
		return "Paquetes\n" + super.toString() + "\n" + paquetes + "\nprecio=" + getPrecio()
				+ "\nvolumen=" + getVolumen() + "\n"+"\n================";
	}

}
