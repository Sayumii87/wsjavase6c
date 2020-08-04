package br.com.livraria.modelo;

public abstract class Produto {
	
	private int id;
	private String descricao;
	private int qtde;
	private float valorCompra;
	private float valorVenda;
	
	public Produto() {}
	
	public Produto(int id, 
			       String descricao, 
			       int qtde, 
			       float valorCompra, 
			       float valorVenda) {
		
		this.id = id;
		this.descricao = descricao;
		this.qtde = qtde;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String exibirSubTotal() {
		return 
				"Subtotal.....: " + (qtde * valorVenda);
	}
	
	public String getAll() {
		return
				"Código.......: " + id + "\n" +
				"Descrição....: " + descricao + "\n" +
				"Qtde.........: " + qtde + "\n" +
				"Valor Compra.: " + valorCompra + "\n" +
				"Valor Venda..: " + valorVenda + "\n";
	}	

	public void setAll(int pId,            // não importa o nome dado aqui, mas sim o tipo 
			                  String pDescricao, 
			                  int pQtde, 
			                  float pValorCompra, 
			                  float pValorVenda) 
	{
		id          = pId;
		descricao   = pDescricao; 
		qtde        = pQtde;
		valorCompra = pValorCompra; 
		valorVenda  = pValorVenda;	
	}
	
	public String getValorVista() {
		return 
				"\nValor Vista..: " + (valorVenda - valorVenda * 0.10);
	}
	
	public void setAjuste(float desconto) {
		valorVenda = valorVenda + (valorVenda * (desconto/100));
		valorCompra = valorCompra + (valorCompra * (desconto/100));
	}
	
	public String avaliarEstoque() {
		if (qtde > 20) {
			return "Estoque cheio";
		} else if (qtde > 10 && qtde <= 20) {
			return "Estoque medio";
		} else {
			return "Estoque baixo";
		}
	}
	
		
	public String getDescricaoSimples() {
		if (descricao.indexOf(" ") == 1) { //-1 significa que ele não encontrou espaço
			return descricao;			
		} else {
			return descricao.substring(0, descricao.indexOf(" "));
		}
	}
	
	public float getValorVista(float porc) {
		return valorVenda = valorVenda - (valorVenda*(porc/100));
	}
}
