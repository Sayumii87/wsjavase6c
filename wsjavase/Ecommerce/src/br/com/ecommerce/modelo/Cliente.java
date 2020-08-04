package br.com.ecommerce.modelo;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String fone;
	private float limite;
	private Endereco endereco;
	
	public String getAll() {
		return 
				"CPF: " + cpf + "\n" +
				"Nome: " + nome + "\n" +
				"Fone: " + fone + "\n" +
				"Limite: " + limite + "\n" +
				"Endereco: \n" + endereco.getAll();
	}
	
	public void setAll (String cpf, String nome, String fone, float limite, Endereco end) { 
		this.cpf = cpf;
		this.nome = nome;
		this.fone = fone;
		this.limite = limite;
		this.endereco = end;
	};

	public Cliente () {}  

	public Cliente (String cpf, String nome, String fone, float limite, Endereco end) { 
		this.cpf = cpf;
		this.nome = nome;
		this.fone = fone;
		this.limite = limite;
		this.endereco = end;
	};
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
