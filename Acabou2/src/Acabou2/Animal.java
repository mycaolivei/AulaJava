package Acabou2;

abstract class Animal {
	String nome;
	
	public Animal(String nome) {
		this.nome=nome;
	}
	public abstract void emitirSom(String nome);
	
	
	public void dormir() {
		System.out.println(nome + " está  dormindo");
	}
}
