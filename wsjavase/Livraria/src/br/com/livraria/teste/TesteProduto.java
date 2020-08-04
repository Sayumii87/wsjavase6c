package br.com.livraria.teste;

import javax.swing.JOptionPane;

import br.com.livraria.modelo.Cd;
import br.com.livraria.modelo.Livro;
import br.com.livraria.modelo.Produto;
import br.com.livraria.tela.Tela;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto produto;
		
		if (JOptionPane.showInputDialog("Cadastrar Livro (L) ou CD (C)").toUpperCase().charAt(0)=='L') { 
			produto = new Livro(
					Tela.i("ID do Livro"),
					Tela.t("Descricao do livro"),
					Tela.i("Quantidade do livro"),
					Tela.f("Valor da Compra"),
					Tela.f("Valor da Venda"),
					Tela.t("Editora"),
					Tela.t("Autor"),
					Tela.i("ISBN")
		            );
		} else {
			produto = new Cd(
					Tela.i("ID do CD"),
					Tela.t("Descricao do CD"),
					Tela.i("Quantidade do CD"),
					Tela.f("Valor da Compra"),
					Tela.f("Valor da Venda"),
					Tela.t("Artista"),
					Tela.t("Gravadora"),
					Tela.t("Estilo")					
					);
		}
		
		JOptionPane.showMessageDialog(null, produto.getAll());
		
		if (produto instanceof Cd) {
			JOptionPane.showMessageDialog(null, "Produto instanciado de CD");
		} else
			JOptionPane.showMessageDialog(null, "Produto instanciado de Livro");
	}

}
