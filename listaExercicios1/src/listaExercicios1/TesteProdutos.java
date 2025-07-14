package listaExercicios1;

public class TesteProdutos {
	public static void main(String[] args) {
	Produtos produto1=new Produtos();
	produto1.setNome("Livro Antifeminista");
	produto1.setPreco(5.00);
	produto1.setQuantidadeEstoque(1);
	System.out.println(produto1.getPreco());
	System.out.println(produto1.getNome());
	System.out.println(produto1.getQuantidadeEstoque());
	}
}