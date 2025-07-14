package Acabou;

public class Competicao {

	public static void main(String[] args) {
		Corredor corredor1=new Corredor("Armand",27);
		Nadador nadador1=new Nadador("Vitor",  29);
		Ciclista ciclista1=new Ciclista("Gustavo", 21);
		nadador1.Aquecer();
		nadador1.Nadar();
		corredor1.Correr();
		corredor1.PararCorrer();

	}

}
