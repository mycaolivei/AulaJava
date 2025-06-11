package Aula02;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		Scanner imput=new Scanner (System.in);
		char letra;
		System.out.println("Digite a inicial do seu sexo: ");
		letra=imput.next().charAt(0);
		System.out.println(letra=='f'?"Feminino":"Masculino");
		

	}

}
