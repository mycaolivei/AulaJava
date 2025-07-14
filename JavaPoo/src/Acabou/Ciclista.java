package Acabou;

class Ciclista extends Atleta{
	Ciclista(String nome, int idade) {
		super(nome, idade);

	}
	public void Pedalar() {
		System.out.println(nome + " está pedalando");
	}
public void PararPedalar() {
	System.out.println(" Parou de pedalar");
	

}
}
