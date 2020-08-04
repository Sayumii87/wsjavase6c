package br.com.polimorfismo.beans;
import br.com.polimorfismo.interfaces.Padrao;

public class Medio extends Formacao implements Padrao{
	
	private String tipo;
	
	public Medio() {};
	
	public Medio(String decricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(decricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
	
	public void setAll(String decricao, int periodo, double mensalidade, int duracao, String tipo) {
		super.setAll(decricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
	
	public String getAll() {
		return
				super.getAll() +
				"Tipo...: " + tipo;
	};

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void calcularMensalidade(double fator) {
		super.definirDuracao();
		double mensalidade = super.getDuracao() * fator * 500;
		super.setMensalidade(mensalidade);
	};
}
