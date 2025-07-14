package listaExercicios1;

public class Produtos {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void adicionarEstoque(int qtd) {
		this.quantidadeEstoque+=qtd;
	}
	public void removerEstoque(int qtd) {
		if (qtd >= this.quantidadeEstoque) {
			this.quantidadeEstoque-=qtd;
	}else {
		System.out.println("Não há valor disponivél");
	}
	}
}
