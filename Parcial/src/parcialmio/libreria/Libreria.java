package parcialmio.libreria;

import java.util.ArrayList;
import java.util.List;

import parcialmio.condiciones.CondicionDefault;
import parcialmio.condiciones.Condiciones;
import parcialmio.condiciones.condicionAND;
import parcialmio.condiciones.condicionMarcaNombre;
import parcialmio.condiciones.condicionMarcaNombreContiene;
import parcialmio.condiciones.condicionOR;
import parcialmio.condiciones.condicionPrecioIgual;
import parcialmio.condiciones.condicionPrecioMayor;
import parcialmio.condiciones.condicionPrecioMenor;
import parcialmio.condiciones.condicionVolumenIgual;
import parcialmio.condiciones.condicionVolumenMayor;
import parcialmio.condiciones.condicionVolumenMenor;

public class Libreria {
	

	private List<Elemento> productos;
	private Condiciones politica;

	public Libreria() {
		this.productos = new ArrayList<Elemento>();
//		this.paquetes = new Paquete("Combos");
		//por default va ser siempre true
		this.politica = new CondicionDefault();
	}

	/**
	 * @return the productos
	 */
	public List<Elemento> getProductos() {
		return new ArrayList<Elemento>(productos);
	}

	/**
	 * @param politica the politica to set
	 */
	public void setPolitica(Condiciones politica) {
		this.politica = politica;
	}

	public List<Elemento> imprimirElementosDiario() {
		List<Elemento> diario = new ArrayList<Elemento>();
		for (Elemento elemento : productos) {
			diario.addAll(elemento.buscarElemento(politica));
		}

		return diario;
	}

	public List<Elemento> buscarElementos(Condiciones condicion) {
		List<Elemento> buscador = new ArrayList<Elemento>();
		
		for (Elemento e : productos) {	
			buscador.addAll(e.buscarElemento(condicion));
		}

		return buscador;
	}

	public void agregarPaquetesLibreria(Elemento e) {
		this.productos.add(e);
	}

	public void agregarProducto(Producto e) {
		this.productos.add(e);
	}

	public List<Elemento> buscar() {
		return null;
	}

	public static void main(String[] args) {
		Libreria lib = new Libreria();

		Producto producto1 = new Producto("a", 200, 45, "a");
		Producto producto2 = new Producto("b", 300, 55, "b");
		Producto producto3 = new Producto("c", 400, 65, "c");
		Producto producto4 = new Producto("d", 100, 65, "d");
		Producto producto5 = new Producto("E", 500, 25, "E");
		Producto producto6 = new Producto("F", 300, 15, "F");
		lib.agregarProducto(producto1);
		lib.agregarProducto(producto2);
		lib.agregarProducto(producto3);
//		System.out.println(lib.getProductos());
//		
		Paquete paquete = new Paquete("combo 1 super max");
		paquete.agregarElemento(producto1);
		paquete.agregarElemento(producto2);
		paquete.agregarElemento(producto3);
		paquete.agregarElemento(producto4);

		Paquete paqueteMax = new Paquete("combo 2 con 1 super max");
		paqueteMax.agregarElemento(producto5);
		paqueteMax.agregarElemento(producto6);

		// paquete 1 con paquete 2
		paquete.agregarElemento(paqueteMax);

		// se agregan 2 paquetes
		lib.agregarPaquetesLibreria(paquete);

//		System.out.println(lib.getPaquetes());

		Condiciones cond1 = new condicionMarcaNombre("a");
		Condiciones cond2 = new condicionMarcaNombreContiene("d");
		
		Condiciones cond3 = new condicionPrecioIgual(1800);
		Condiciones cond4 = new condicionPrecioMayor(800);
		Condiciones cond5 = new condicionPrecioMenor(400);
		
		Condiciones cond6 = new condicionVolumenIgual(45);
		Condiciones cond7 = new condicionVolumenMayor(1);
		Condiciones cond8 = new condicionVolumenMenor(1);
		
//		Condiciones cond9 = new condicionAND();
//		Condiciones cond10 = new condicionOR();
		System.out.println(lib.buscarElementos(cond1));
		
		
		
		//setear comportamiento
//		lib.setPolitica(cond6);
//		System.out.println(lib.imprimirElementosDiario());



	}

}
