package Aula02;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
		Scanner imput=new Scanner(System.in);
		System.out.println("Digite uma nota: ");
		double nota=imput.nextDouble();
		System.out.println("Digite mais uma nota: ");
		double nota2=imput.nextDouble();
		double soma=(nota+nota2)/2;
		System.out.printf("A media das notas é %f", soma);
	}

}
