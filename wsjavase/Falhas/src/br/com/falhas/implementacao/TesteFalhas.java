package br.com.falhas.implementacao;

import br.com.falhas.excecao.Excecao;

public class TesteFalhas {

	public static void main(String[] args) {
		
		String palavra = null;
		
		try { //ficam as linhas onde podem ser disparadas as excecoes
			
			int numero = Integer.parseInt("1");
			System.out.println(palavra.length());
			System.out.println(numero);
			
			int x[] = new int[2];
			x[0] = 15;
			x[1] = 98;
			//x[2] = 12;
		} 
		
		//catch(Exception e) {    // trata a excecao. Exception � o pai de todas as excecoes
		catch(Exception e) {	
			System.out.println(Excecao.tratarExcecao(e));
		}
		finally {    // as linhas deste bloco, ser�o executadas se houver ou n�o excecao
			System.out.println("Tenha um bom dia!");
		}
	}
}
