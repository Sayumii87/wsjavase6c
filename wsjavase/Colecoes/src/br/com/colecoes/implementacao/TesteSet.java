package br.com.colecoes.implementacao;
import java.util.Set;
import java.util.HashSet;

public class TesteSet {

	public static void main(String[] args) {
		
		Set lista = new HashSet();
		lista.add("DBA");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		lista.add("DBA");
		lista.add("DEV");
		lista.add("CURIOSO");
		lista.add("XPTO");
		lista.add("GP");
		
		System.out.println(lista);
		
	    lista.remove("XPTO");
	    
	    //não funciona SORT no Hash
	    //Collection.sort(lista);
	}

}
