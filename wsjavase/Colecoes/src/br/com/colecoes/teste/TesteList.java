package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		
		// armazenar vários tipos de dados em um mesmo elemento
		// Interface List
		
		List lista = new ArrayList();
		
		// ADICIONAR ITEM
		
		lista.add("DBA");
		lista.add(15000);
		lista.add("ESTAGIARIO");
		lista.add(1500);
		lista.add("ANALISTA");
		lista.add(16000);
		lista.add("DBA");
		lista.add(16000);
		
		// ORDENAR LISTA
		System.out.println("Não ordenada: " + lista);
		
		//Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		
		// REMOVER ITEM
		
		//lista.remove(0);
		System.out.println(lista);
		
		for (int contador=0; contador < lista.size(); contador ++) {
			System.out.println("Cargo: " + lista.get(contador));
			
		}
		
		//TOTAL DE SALARIOS
		
		float total = 0;
		
		for (int contador=1; contador < lista.size(); contador +=2) {
			total+= (double) lista.get(contador);					
		}
		
		System.out.println("Salarios: " + total);
	}

}
