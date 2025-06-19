package Fundamentos2;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
			Scanner imput= new Scanner(System.in);
			System.out.println("Quantos alunos há na sua sala?: ");
			int resp=imput.nextInt();
			int x=0;
			double soma=0;
			while(x < resp) {
				System.out.println("Digite a nota dos alunos: ");
				double resp2=imput.nextDouble();
				soma=soma+resp2;	
				x++;
				
			}
			double media= soma/resp;
			String mediaaprovados=( media > 7 ? "Aprovado":"Reprovados");
			System.out.printf("A média da turma foi %.2f"+ " e a turma foi %s", media,mediaaprovados);
		}


}



