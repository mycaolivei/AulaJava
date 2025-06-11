package Aula02;

import java.util.Scanner;

public class atv02 {

	public static void main(String[] args) {
		Scanner imput= new Scanner(System.in);
		int dia;
		System.out.println("Digite um número: ");
		dia=imput.nextInt();
		
		if (dia==1){
			System.out.println("Domingo");}
		else if(dia==2){
			System.out.println("Segunda-Feira");}
		else if(dia==3) {
			System.out.println("Terça-Feira");}
		else if(dia==4) {
			System.out.println("Quarta-Feira");}
		else if(dia==5) {
			System.out.println("Quinta-Feira");}
		else if(dia==6) {
			System.out.println("Sexta-Feira");}
		else if(dia==7) {
			System.out.println("Sabado");}
		
		else {
			System.out.println("Número Invalido");}
	}

}
