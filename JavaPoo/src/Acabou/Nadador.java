package Acabou;

class Nadador extends Atleta{
	Nadador(String nome, int idade) {
		super(nome, idade);

	}
	public void Nadar() {
		System.out.println(nome + " está nadando");
		}
public void PararNadar() {
	System.out.println(" Parou de nadar");
}
}
