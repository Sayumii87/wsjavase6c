package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListComObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA",15000,"PLENO"));
		lista.add(new Cargo("DBA",12000,"JR"));
		lista.add(new Cargo("ESTAGIARIO",3000,"SENIOR"));
		lista.add(new Cargo("DEV",14000,"PLENO"));
		
		// assim so retorna o endereco de memoria
		//System.out.println(lista);
		
		for (int cont=0; cont < lista.size(); cont++) {
			System.out.println(lista.get(cont).getAll());
		}
		
		float total=0;
		
		// TOTAL DE SALARIOS
		
		for (int cont=0; cont < lista.size(); cont++) {
			total = total + lista.get(cont).getSalario();
		} 
		System.out.println("Total salario: " + total);
		
		// for it
		
		total = 0;
		
		for (Cargo c : lista) {
			total+=c.getSalario();
		}
		
		System.out.println("Total de salarios: " + total);
		
		// o java nao sabe ordenar objeto, precisa informar
		Collections.sort(lista);
		
		for (int cont=0; cont < lista.size(); cont++) {
			System.out.println(lista.get(cont).getAll());
		}
		
	}
}