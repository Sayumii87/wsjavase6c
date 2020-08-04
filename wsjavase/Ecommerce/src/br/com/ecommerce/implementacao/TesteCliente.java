package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;
import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;

public class TesteCliente {
	

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
									  JOptionPane.showInputDialog("CPF"),
									  JOptionPane.showInputDialog("Nome"),
									  JOptionPane.showInputDialog("Fone"),
									  Float.parseFloat(JOptionPane.showInputDialog("Limite")),
									  
									  // o parâmetro de endereço é uma Classe
									  // precisa informar campo a campo, conforme definido na Classe Cliente 
									  new Endereco (
											         JOptionPane.showInputDialog("Logradouro"),
											         JOptionPane.showInputDialog("Numero"),
											         JOptionPane.showInputDialog("Complemento"),
											         JOptionPane.showInputDialog("Bairro"),
											         JOptionPane.showInputDialog("Cidade"),
											         JOptionPane.showInputDialog("UF"),
											         JOptionPane.showInputDialog("CEP")
											       )
									  
				);
		
		JOptionPane.showMessageDialog(null, cliente.getAll());

	}

}
