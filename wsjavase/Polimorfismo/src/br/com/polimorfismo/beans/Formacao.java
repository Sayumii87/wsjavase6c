package br.com.polimorfismo.beans;

public abstract class Formacao {

	private String descricao = new String();
	private int periodo;
	private double mensalidade;
	private int duracao;
	
	public Formacao() {}

	public Formacao(String decricao, int periodo, double mensalidade, int duracao) {
		this.descricao = decricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	};
	
	public void setAll(String decricao, int periodo, double mensalidade, int duracao) {
		this.descricao = decricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	};
	
	public String getAll() {
		return
				"Descri��o.....: " + descricao + "\n" +
				"Periodo.......: " + periodo + "\n" +
				"Mensalidade...: " + mensalidade + "\n" +
				"Duracao...: " + duracao + "\n";
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	};
	
	public void definirDuracao() {
		
		if (this instanceof Medio) {
			duracao = 36;
		} else if (this instanceof Tecnologo) {
			duracao = 24;
		} else if (descricao.toUpperCase().indexOf("ENGENHARIA")==-1) {
				duracao = 48;
			} else {
				duracao = 60;
			  }
	};
	
	public double exibirMedias(double ps1, double ps2) {
		return (ps1 + ps2) / 2;
	};
	
	public double exibirMedias(double ps1, double ps2, double nac1, double nac2) {
		
		double ps = ((ps1+ps2) /2);
		double nac = ((nac1 + nac2) / 2);
		double media = (ps * 0.8) + (nac * 0.2);
		
		return media; 
	}
	
	public double exibirMedias(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		double ps = ((ps1+ps2) /2);
		double nac = ((nac1 + nac2) / 2);
		double am = ((am1 + am2) /2 );
		double media = (ps * 0.5) + (nac * 0.2) + (am * 0.3);
		
		return media;
	}
	
	public void calcularMensalidade(double fator) {};
}
