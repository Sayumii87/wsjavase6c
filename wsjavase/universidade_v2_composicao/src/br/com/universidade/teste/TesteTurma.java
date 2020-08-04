package br.com.universidade.teste;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Turma;
import br.com.universidade.tela.Magica;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma = new Turma(
				Magica.t("Nome da Turma"),
				new Curso(
						Magica.i("Código"),
						Magica.t("Descricao"),
						Magica.f("Valor"),
						Magica.i("Carga Horaria")
						),
				Magica.t("Período"),
				new Aluno(
						Magica.t("Nome"),
						Magica.t("Email"),
						Magica.i("RM"),
						new Endereco(
								Magica.t("Logradouro"),
								Magica.t("Numero"), 
								Magica.t("Complemento"), 
								Magica.t("Bairro"), 
								Magica.t("Cidade"), 
								Magica.t("UF"), 
								Magica.t("CEP") 
								)
						)
				);
		
		System.out.println(turma.getAll());
		
		System.out.println(turma.getAluno().getEndereco().getCep());
	}

}
