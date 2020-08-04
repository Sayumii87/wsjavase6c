package br.com.colecoes.beans;

public class Cargo implements Comparable<Cargo>{

	private String nome;
	private float salario;
	private String nivel;
	
	public Cargo() {}
	
	public Cargo(String nome, float salario, String nivel) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.nivel = nivel;
	};
	
	public void SetAll(String nome, float salario, String nivel) {
		this.nome = nome;
		this.salario = salario;
		this.nivel = nivel;
	};
	
	public String getAll() {
		return
				"Nome: " + nome + "\n" +
				"Salario: " + salario + "\n" +
				"Nivel: " + nivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	/*public int compareTo(Cargo outro) {
		if (salario > outro.salario) {
			return -1;          // retorna negativo se a primeira string � menor que a segunda
		} else if (salario<outro.salario) {
			return 1;  // retorna positivo se a primeira string � maior que a segunda
		}
			return 0;  //retorna 0 se a primeira string � igual a segunda
	}*/
	
	public int compareTo(Cargo outro) {
		return nome.compareTo(outro.nome);		
	}
}
