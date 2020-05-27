package testeArraylist;

import java.util.ArrayList;

public class ListaUser {
	Usuario usuario;
	ArrayList<Usuario> listaUser = new ArrayList<Usuario>();


	void adicionarUser(Usuario user) {
		this.listaUser.add(new Usuario(usuario.nome, usuario.idade));
	}
	
	void imprimirU(){
	for(Usuario printUser: listaUser) {
		System.out.println(printUser.nome+" "+printUser.idade);}
	
	}
	
	
	}

