package br.com.universidade.modelo;

public abstract class Pessoa {
	
    private String nome;
	private Endereco endereco;
	
	
	public boolean verificarDados() {
		return false;
	}
	
	public Pessoa(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public Pessoa() {
		super();
	};

	public void setAll(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	} 
	
	public String getAll() {
		return 
				"Nome......: " + nome + "\n" + "Endereco:...." + endereco.getAll(); 
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	};

}