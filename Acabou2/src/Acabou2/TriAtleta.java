package Acabou2;

public class TriAtleta  implements Corredor2, Nadador2, Ciclista2{

	@Override
	
	public void Aquecer() {
		
	System.out.println(nome + " começou a aquecer");	
	}

	@Override
	public void pedalar() {
	System.out.println(nome + " começou a pedalar");
		
	}

	@Override
	public void pararPedalar() {
	System.out.println(nome + " parou de pedalar");
		
	}

	@Override
	public void Nadar() {
		System.out.println(nome + " começou a nadar");
		
	}

	@Override
	public void pararNadador() {
		System.out.println(nome + " parou de nadar");
	}

	@Override
	public void Correr() {
		System.out.println(nome + " está correndo");
		
	}

	@Override
	public void pararCorrer() {
		System.out.println(nome + " parou de correr");
		
	}

}
