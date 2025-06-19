package Fundamentos2;

import java.util.Scanner;

public class atv7 {

	public static void main(String[] args) {
		double soma=0,media=0;
		Scanner imput=new Scanner(System.in);
		System.out.println("Quantos alunos há na sala?: ");
		int qntdalunos=imput.nextInt();
		for(int i=1; i <= qntdalunos; i++) {
		System.out.println("Agora digite a nota?: ");
		soma+=imput.nextDouble();
	
		
		}
			media=soma/qntdalunos;
		System.out.println(media > 7? "Aprovados":"Reprovados");

	}

}
