package Acabou2;

public class Gato extends Animal{
	public Gato(String nome) {
		super(nome);
	}
	public void  emitirSom(String nome) {
		System.out.printf( " %s está  miando \n ", nome);
	}
}
