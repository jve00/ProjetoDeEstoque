package application;

public class Produto {
	private TipoDoProduto tipo;
	private String nomeDoProduto;
	private double precoUnitario;
	private double precoPorQuilo;
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public double getPrecoPorQuilo() {
		return precoPorQuilo;
	}
	public void setPrecoPorQuilo(double precoPorQuilo) {
		this.precoPorQuilo = precoPorQuilo;
	}
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public TipoDoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoDoProduto tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "[ \n  Nome do produto : " + nomeDoProduto 
				+ ",\n Preco Unitario do Produto : "
				+  precoUnitario 
				+ ",\n Preco por Quilo do Produto : "
				+ precoPorQuilo + ", \n Tipo do Produto : "
				+ tipo
				+ "]";
	}
	}


