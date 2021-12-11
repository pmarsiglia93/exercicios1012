package br.com.generation.exercicios1012;

import java.util.Scanner;

public class Ex03While {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		int idade = 0, contador21 = 0, contador50 = 0;
		
		while(idade != -99) {
			
			System.out.println("Digite a sua idade: ");
			idade = in.nextInt();
			
			if(idade <21 && idade >0) {
				contador21 = contador21 + 1 ; 
			}
			else if (idade>50) {
				contador50 = contador50 + 1;
			}
			
		}
		
		System.out.println("Pessoas com menos de 21 anos: " + contador21);
		System.out.println("Pessoas com mais de 50 anos: " + contador50);
				
		in.close();

	}

}
