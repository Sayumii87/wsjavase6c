package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProdutoConstrutorCheio {

	public static void main(String[] args) {
		Produto produto = new Produto(		
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descricao"),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
				Float.parseFloat(JOptionPane.showInputDialog("Compra")),
				Float.parseFloat(JOptionPane.showInputDialog("Venda")));
		
		System.out.println(produto.getAll());
	}
}
