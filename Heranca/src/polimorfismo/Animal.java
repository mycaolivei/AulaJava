package polimorfismo;

public class Animal {
	String nome;
	int idade;
	String raca;

	public Animal(String nome, String raca, int idade) {
	this.nome=nome;
	this.idade=idade;
	this.raca=raca;
	
}
	public void comer() {
		System.out.println(" está comendo");
	}
}

