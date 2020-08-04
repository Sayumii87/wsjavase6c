package br.com.universidade.modelo;

public class Aluno {
	
	private String nome;
	private String email;
	private int rm;
	private Endereco endereco;
	
	// Sintaxe para criacao de um metodo
	// <modificador> <retorno> <nomeDoMetodo> (tipoParametro, <nomeParametro>) 

	public Aluno() {};
	
	public Aluno (String pNome,
			      String pEmail,
			      int pRm,
			      Endereco pEnd) 
	{
		this.nome = pNome;
		this.email = pEmail;
		this.rm = pRm;
		this.endereco = pEnd;
	};
	
    public String getAll() {
		return
			"Nome..: " + nome  + "\n" +
			"Email.: " + email + "\n" +
			"Rm....: " + rm +
			"ENDERECO\n" + endereco.getAll();
	}

 	public void setAll(String pNome, String pEmail, int pRm, Endereco pEnd){
		this.nome = pNome;
		this.email = pEmail;
 		this.rm = pRm;
 		this.endereco = pEnd;
    }
	
	public String getNome() {  // retorna uma String de nome
		return nome;
	}
	
	public void setNome(String pNome) {   // náo retorna nada, so preenche
		nome = pNome;
	}
	
	public String getEmail() {  // retorna uma String de email
		return email;
	}
	
	public void setEmail(String pEmail) {   // náo retorna nada, so preenche
		email = pEmail;
	}
	
	public int getRm() {  // retorna um INT de rm
		return rm;
	}
	
	public void setRm(int pRm) {   // náo retorna nada, so preenche
		rm = pRm;
	}
}
