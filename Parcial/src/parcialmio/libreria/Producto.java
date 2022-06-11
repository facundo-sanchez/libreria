package parcialmio.libreria;

import java.util.ArrayList;
import java.util.List;


import parcialmio.condiciones.Condiciones;

public class Producto extends Elemento{

	private String marca;
	private double precio;
	private int volumen;
	
	public Producto(String nombre) {
		super(nombre);
		this.marca = "Sin marca";
	}
	
	public Producto(String nombre, double precio, int volumen,String marca) {
		super(nombre);
		this.precio = precio;
		this.volumen = volumen;
		this.marca = marca;
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

	@Override
	public int getVolumen() {
		return this.volumen;
	}
	


	@Override
	public int calcularNumProductos() {
		return 1;
	}

	@Override
	public String toString() {
		return "\nProducto: "+super.toString()+"\nMarca: " + marca+ "\nPrecio: "+precio+"\nVolumen: "+volumen+"\n";
	}

	@Override
	public List<Elemento> buscarElemento(Condiciones cond) {
		List<Elemento> resultados = new ArrayList<Elemento>();
		if(cond.cumpleCondicion(this)) {
			resultados.add(this);
		}
		return resultados;
	}



	
	


}
