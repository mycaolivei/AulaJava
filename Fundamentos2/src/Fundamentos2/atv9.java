package Fundamentos2;

import java.util.Arrays;
import java.util.Scanner;

public class atv9 {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		int Array1[] = new int[4];
		int Array2[] = new int[4];
		int Array3[] = new int[4];
		int Array4[] = new int[4];
		
		int resp = 0;
		for (int i = 0; i < Array1.length; i++) {

			System.out.printf("Digite %d do Array1: ",i+1);
			Array1[i] = imput.nextInt();
			
			System.out.printf("Digite %d do Array2: ",i+1);
			Array2[i] = imput.nextInt();
			
			System.out.printf("Digite %d do Array3: ",i+1);
			Array3[i] = imput.nextInt();
			
			System.out.printf("Digite %d do Array4: ",i+1);
			Array4[i] = imput.nextInt();
			
		}
		System.out.println(Arrays.toString(Array1));
		System.out.println(Arrays.toString(Array2));
		System.out.println(Arrays.toString(Array3));
		System.out.println(Arrays.toString(Array4));
	}
	

}
