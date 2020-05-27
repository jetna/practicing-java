package testeArraylist;

import java.util.ArrayList;

public class Sistema {
	@SuppressWarnings("null")
	public static void main(String[] args) {
	//a forma que eu consegui
	/*ArrayList<Usuario> listaUser=new ArrayList<Usuario>();
	listaUser.add(new Usuario("Ana", 15));
	listaUser.add(new Usuario("João", 18));
	listaUser.add(new Usuario("Sara", 17));*/
	
	//sem criar outra lista
		ListaUser listarusuarios = new ListaUser();
		listarusuarios.listaUser.add(new Usuario("Juliana",29));
		listarusuarios.listaUser.add(new Usuario("Lia",29));
		
		
	//ListaUser lista=null;
	//lista.add(new Usuario("Anna",18));
	//lista.adicionarUser(new Usuario("an",8));
	//System.out.println(lista);
	//***********
	
	
	//*********************** IMPRIMINDO **************************//
	/*for(Usuario printUSer: listaUser)
	System.out.println(printUSer.nome+", "+printUSer.idade);*/
	
		for(Usuario printUser: listarusuarios.listaUser) {
			System.out.println(printUser.nome+" "+printUser.idade);}
		
		System.out.println("\n--------------\n"+listarusuarios.listaUser.size());


	}
}
