package Acabou2;

public class TesteAnimal {

	public static void main(String[] args) {
		Gato animal1=new Gato("Floquinho");
		String Animais[]= {"Caramelo","Floquinho","Jujuba","Miaur"};
		for(String n:Animais) {
			animal1.emitirSom(n);
			animal1.dormir();
	
		}
		
	}

}
