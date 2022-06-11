package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionOR implements Condiciones {
	private Condiciones cond1;
	private Condiciones cond2;
	
	public condicionOR(Condiciones cond1, Condiciones cond2) {
		super();
		this.cond1 = cond1;
		this.cond2 = cond2;
	}


	@Override
	public boolean cumpleCondicion(Elemento e) {
		return this.cond1.cumpleCondicion(e) || this.cond2.cumpleCondicion(e);
	}

}
