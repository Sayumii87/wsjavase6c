package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class TesteVenda3 {
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
									Integer.parseInt(JOptionPane.showInputDialog("Numero Nota Fiscal")),
									
									new Cliente (
											     Magica.t("Cpf"),
											     Magica.t("Nome"),
											     Magica.t("Fone"),
											     Magica.f("Limite"),
											     
											     new Endereco 
											         (
											    		 Magica.t("Logradouro"),
											    		 Magica.t("Numero"),
											    		 Magica.t("Complemento"),
											    		 Magica.t("Bairro"),
											    		 Magica.t("Cidade"),
											    		 Magica.t("UF"),
											    		 Magica.t("CEP")
											         )
											    ),
											     
								    new Produto (
								    		     Magica.i("Id Produto"),
								    		     Magica.t("Descricao"),
								    		     Magica.i("Qtde"),
								    		     Magica.f("Valor Compra"),
								    		     Magica.f("Valor Venda")
								    		    ),
								    
								    Magica.f("Total"),
								    Magica.t("Data")
				               );
		JOptionPane.showMessageDialog(null, venda.getAll());
	}

}
