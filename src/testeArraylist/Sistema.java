package testeArraylist;

import java.util.ArrayList;

public class Sistema {
	@SuppressWarnings("null")
	public static void main(String[] args) {

	//sem criar outra lista
		ListaUser listarusuarios = new ListaUser();
		listarusuarios.listaUser.add(new Usuario("Juliana",29));
		listarusuarios.listaUser.add(new Usuario("Lia",29));
			
		for(Usuario printUser: listarusuarios.listaUser) {
			System.out.println(printUser.nome+" "+printUser.idade);}
		
		System.out.println("\n--------------\n"+listarusuarios.listaUser.size());


	}
}
