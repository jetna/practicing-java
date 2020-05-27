package lojaSapatos;

import java.util.ArrayList;

public class carrinhoCompra {
	Calcado calcado;
	ArrayList<Calcado> carrinhoLista = new ArrayList<Calcado>();
	
	void adicionarCalcadoLista(Calcado calcado) {
		this.carrinhoLista.add(new Calcado(this.calcado.num, this.calcado.cor, this.calcado.salto));
	}
	
	
}
