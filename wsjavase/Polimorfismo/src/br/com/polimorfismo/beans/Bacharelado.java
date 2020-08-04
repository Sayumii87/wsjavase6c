package br.com.polimorfismo.beans;

import br.com.polimorfismo.interfaces.Padrao;

public class Bacharelado extends Formacao implements Padrao{

	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public Bacharelado() {}

	public Bacharelado(String decricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(decricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	};
	
	
	public void setAll(String decricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super.setAll(decricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	};
	
	public String getAll() {
		return
				super.getAll() +
				"Projeto Conclusao....: " + projetoConclusao;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade((super.getDuracao() * fator * 600) + (cargaHorariaEstagio * 12));
	};
	
}
