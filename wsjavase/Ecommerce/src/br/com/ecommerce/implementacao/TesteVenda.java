package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;

public class TesteVenda {
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
									Integer.parseInt(JOptionPane.showInputDialog("Numero Nota Fiscal")),
									
									new Cliente (
											     JOptionPane.showInputDialog("Cpf"),
											     JOptionPane.showInputDialog("Nome"),
											     JOptionPane.showInputDialog("Fone"),
											     Float.parseFloat(JOptionPane.showInputDialog("Limite")),
											     
											     new Endereco 
											         (
											    		 JOptionPane.showInputDialog("Logradouro"),
											    		 JOptionPane.showInputDialog("Numero"),
											    		 JOptionPane.showInputDialog("Complemento"),
											    		 JOptionPane.showInputDialog("Bairro"),
											    		 JOptionPane.showInputDialog("Cidade"),
											    		 JOptionPane.showInputDialog("UF"),
											    		 JOptionPane.showInputDialog("CEP")
											         )
											    ),
											     
								    new Produto (
								    		     Integer.parseInt(JOptionPane.showInputDialog("Id Produto")),
								    		     JOptionPane.showInputDialog("Descricao"),
								    		     Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
								    		     Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
								    		     Float.parseFloat(JOptionPane.showInputDialog("Valor Venda"))
								    		    ),
								    
								    Float.parseFloat(JOptionPane.showInputDialog("Total")),
								    JOptionPane.showInputDialog("Data")
				               );
		JOptionPane.showMessageDialog(null, venda.getAll());
	}

}
