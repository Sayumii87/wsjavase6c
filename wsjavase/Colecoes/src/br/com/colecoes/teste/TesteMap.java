package br.com.colecoes.teste;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		
		Map<Integer,Cargo> lista = new HashMap<Integer,Cargo>();
		lista.put(1, new Cargo ("DBA",15000,"PLENO"));
		lista.put(2, new Cargo ("ESTAGIARIO",3000,"SENIOR"));
		lista.put(3, new Cargo ("DEV",14000,"PLENO"));
		System.out.println("Chaves: " + lista.keySet());
		
		for (Cargo c : lista.values()) {
			System.out.println(c.getAll());
		}
	}

}
