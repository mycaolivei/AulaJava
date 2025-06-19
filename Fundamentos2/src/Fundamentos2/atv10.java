package Fundamentos2;

import java.util.Arrays;
import java.util.Scanner;

public class atv10 {

	public static void main(String[] args) {
		Scanner imput=new Scanner(System.in);
		double soma=0, media=0;
		double notas[]=new double[5];	
		for (int i=0; i< notas.length;i++) {
		System.out.printf("Digite a nota %d:  ", i+1);
		notas[i]=imput.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		for(double n: notas) {
			soma+=n;
		}
		media=soma/notas.length;

		System.out.printf("A média da turma é %.2f", media);
		
		
		
		}
			
}
