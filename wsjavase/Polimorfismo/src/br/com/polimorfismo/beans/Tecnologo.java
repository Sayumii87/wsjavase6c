package br.com.polimorfismo.beans;
import br.com.polimorfismo.interfaces.Padrao;

public class Tecnologo extends Formacao implements Padrao{
	
	private boolean planoEstendido;
	
	public Tecnologo() {
		super();
	};

	public Tecnologo(String decricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(decricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	};
	
	public void setAll(String decricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super.setAll(decricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	};
	
	public String getAll() {
		return
				super.getAll() + 
				"Plano estendido....:" + planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	};
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 600);
	}
	
}
