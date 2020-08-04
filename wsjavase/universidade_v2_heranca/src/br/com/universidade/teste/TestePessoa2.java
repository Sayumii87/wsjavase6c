package br.com.universidade.teste;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Pessoa;
import br.com.universidade.modelo.Professor;
import br.com.universidade.tela.Magica;

public class TestePessoa2 {

		public static void main (String args[]) {
		//Pessoa pessoa = new Pessoa();
		
		// Peça ao usuário o que ele deseja cadastrar
		// Professor ou Aluno
		// Dependendo da escolha solicite dados e exiba no final
		
		Pessoa pessoa=null;
					
		if (JOptionPane.showInputDialog("Cadastrar Professor (P) ou Aluno A").toUpperCase().charAt(0)=='A') { 
			pessoa = new Aluno(
						Magica.t("Nome do Aluno"),
						new Endereco (Magica.t("Logradouro"),
								      Magica.t("Numero"),
								      Magica.t("Complemento"),
								      Magica.t("Bairro"),
								      Magica.t("Cidade"),
								      Magica.t("UF"),
								      Magica.t("CEP")
								     ) ,
						Magica.t("Email"),
						Magica.i("RM")
						
					);
			
		} else if (JOptionPane.showInputDialog("Cadastrar Professor (P) ou Aluno A").toUpperCase().charAt(0)=='P') {	
			pessoa = new Professor(
					    Magica.t("Nome do Professor"),
					    new Endereco (Magica.t("Logradouro"),
						     	      Magica.t("Numero"),
							          Magica.t("Complemento"),
							          Magica.t("Bairro"),
							          Magica.t("Cidade"),
							          Magica.t("UF"),
							          Magica.t("CEP")
							          ) ,
					    Magica.t("Data da contratacao"),
					    Magica.t("Titulacao"),
					    Magica.f("Valor da hora")
					);
						
		} else {JOptionPane.showMessageDialog(null,"Opcao invalida!");}
		
		JOptionPane.showMessageDialog(null, pessoa.getAll());
		JOptionPane.showMessageDialog(null, pessoa.verificarDados());
				
	}
}
