package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto objeto = new Produto();
	
		objeto.preencherTudo(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o id")), 
				JOptionPane.showInputDialog("Digite a descricao"), 
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")), 
				Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de compra")), 
				Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de venda"))
				);
		
		JOptionPane.showMessageDialog(null, objeto.getAll() + objeto.exibirSubTotal() + objeto.getValorVista());
		
		objeto.setAjuste(10);
		JOptionPane.showMessageDialog(null, "Valor da compra ajustado: " + objeto.getValorCompra() + 
				                            "Valor da venda ajustada:  " + objeto.getValorVenda());
		
		JOptionPane.showMessageDialog(null, objeto.avaliarEstoque());
		
		JOptionPane.showMessageDialog(null, "Primeira letra da descrição: " + objeto.getDescricaoSimples());
		
		Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem"));
		JOptionPane.showMessageDialog(null, "Valor de venda com desconto: " + objeto.getValorVista(50));
		
	}

}
