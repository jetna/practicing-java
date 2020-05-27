package lojaSapatos;

import java.util.ArrayList;

public class Sistema {
public static void main(String[] args) {
	ArrayList<Calcado> carCompra = new ArrayList<Calcado>();
	carCompra.add(new Calcado(36,"amarelo",true));

for(Calcado listarCal: carCompra) {
	
System.out.println(listarCal.cor+listarCal.num+listarCal.salto);}


}}

