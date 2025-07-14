package polimorfismo;

public class Gato extends Animal{
public Gato(String nome, String raca, int idade) {

	 super(nome, raca, idade);
	}

	public void comer(String comida) {
		System.out.printf("Foi comer %s \n", comida);
	}
}
