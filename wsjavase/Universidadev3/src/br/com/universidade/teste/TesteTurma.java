package br.com.universidade.teste;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Turma;
import br.com.universidade.tela.Tela;

public class TesteTurma {

	public static void main(String[] args) {
		
		Turma turma = new Turma(
								Tela.t("Nome da Turma"),
								
								new Curso 
								          (Tela.i("Id do Curso"),
								           Tela.t("Descricao do Curso"),
								           Tela.f("Valor do Curso"),
								           Tela.i("Carga Horaria")
								          ),
								
								Tela.t("Periodo"),
			          
								new Aluno
									      (Tela.t("Nome do Aluno"),
									       Tela.t("Email do Aluno"),
									       Tela.i("RM do Aluno"),
									       
									       new Endereco
									                    (Tela.t("Logradouro"),
									                     Tela.t("Numero"),
									                     Tela.t("Complemento"),
									                     Tela.t("Bairro"),
									                     Tela.t("Cidade"),
									                     Tela.t("UF"),
									                     Tela.t("CEP")
									                    )
									       
									      )
				       );
		
		JOptionPane.showMessageDialog(null, turma.getAll());
	}

}
