package parcialmio.condiciones;

import parcialmio.libreria.Elemento;

public class condicionAND implements Condiciones {

	private Condiciones cond1;
	private Condiciones cond2;

	public condicionAND(Condiciones cond1, Condiciones cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}

	@Override
	public boolean cumpleCondicion(Elemento e) {
		return this.cond1.cumpleCondicion(e) && this.cond2.cumpleCondicion(e);
	}

}
