package br.com.universidade.modelo;
import br.com.universidade.interfaces.PadraoPessoas;

public class Professor extends Pessoa implements PadraoPessoas{

	private String dtContratacao;
	private String titulacao;
	private float valorHora;
		
	public String getAll() {
		return 
				super.getAll() + "\n" +                  //Retorna o getAll da Super Classe
				"Contratacao: " + dtContratacao + "\n" +
				"Titulacao..: " + titulacao + "\n" +
				"Valor Hora.: " + valorHora; 
	}
	
	public void setAll(String nome, Endereco endereco, String dtContratacao, String titulacao, float valorHora) {
		super.setAll(nome, endereco);                // se usar somente setAll tbm funciona, pois a qtde
		this.dtContratacao = dtContratacao;          // de parametros � diferente
		this.titulacao = titulacao;
		this.valorHora = valorHora;
	} 
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, Endereco endereco, String dtContratacao, String titulacao, float valorHora) {
		super(nome, endereco);
		this.dtContratacao = dtContratacao;
		this.titulacao = titulacao;
		this.valorHora = valorHora;
	}
	public String getDtContratacao() {
		return dtContratacao;
	}
	public void setDtContratacao(String dtContratacao) {
		this.dtContratacao = dtContratacao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public boolean verificarDados() {
		// TODO Auto-generated method stub
		return false;
	}
}
