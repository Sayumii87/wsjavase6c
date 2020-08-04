package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;

// Outra forma de fazer TesteVenda.java

public class TesteVenda2 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf(JOptionPane.showInputDialog("CPF"));
		cliente.setFone(JOptionPane.showInputDialog("Fone"));
		cliente.setNome(JOptionPane.showInputDialog("Nome"));
		cliente.setLimite(Float.parseFloat(JOptionPane.showInputDialog("Limite")));
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		endereco.setUf(JOptionPane.showInputDialog("UF"));
		endereco.setComplemento(JOptionPane.showInputDialog("Complemento"));
		endereco.setNumero(JOptionPane.showInputDialog("Numero"));
				
		Produto produto = new Produto();
		Venda venda = new Venda();

	}

}
