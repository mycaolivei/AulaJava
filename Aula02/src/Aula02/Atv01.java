package Aula02;

import java.util.Scanner;

public class Atv01 {

	public static void main(String[] args) {
	 Scanner entrada= new Scanner(System.in);
	 System.out.println("Digite um número: ");
	 int num1=entrada.nextInt();
	 System.out.println("Digite um segundo número: ");
	 int num2=entrada.nextInt();
	 System.out.println("Digite um terceiro número");
	 int  num3=entrada.nextInt();
	 int resultado=( num1 > num2 && num1 > num3? num1: num2 > num1 && num2 > num3? num2: num3);
	 System.out.printf("O maior número é %d", resultado);
	 	
	}

}
