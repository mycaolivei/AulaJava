package Acabou;

class Corredor extends Atleta {
		Corredor(String nome, int idade) {
		super(nome, idade);
	
	}
	public void Correr() {
			System.out.println(nome + " Está correndo");
		}
	public void PararCorrer() {
		System.out.println( nome + " parou de correr");
		
	}
}
