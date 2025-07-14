package Acabou;

abstract class Atleta {
	public String nome;
	public int idade;
	
	
 Atleta(String nome, int idade) {
	this.nome=nome;
	this.idade=idade;
}
	
public void Aquecer() {
	System.out.println(nome + " está aquecendo");
}
}
