package br.com.generation.exercicios1012;

import java.util.Scanner;

public class Ex04While {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, sexo = 0,  opcoes = 0; 
		int sexoOutros = 0;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int idade40Nervosas = 0;
		int menos18Calmas = 0;
		
		while(idade != -1 && sexo != -1 && opcoes != -1) {
	
			System.out.println("Qual a sua idade?");
			idade = entrada.nextInt();
			
			System.out.println("Qual o seu sexo?");
			System.out.println("1 - Feminino");
			System.out.println("2 - Masculino");
			System.out.println("3 - Outros");
			sexo = entrada.nextInt();
			
			System.out.println("Selecione uma das opções: ");
			System.out.println("Calma");
			System.out.println("Nervosa");
			System.out.println("Agressiva");
			opcoes = entrada.nextInt();
			
			if(opcoes == 3) {
				pessoasCalmas = pessoasCalmas + 1;
			}
			if(sexo == 1 && opcoes == 2) {
				mulheresNervosas = mulheresNervosas +1;
			}
			if(sexo == 2 && opcoes == 3) {
				homensAgressivos = homensAgressivos +1;
			}
			if(sexoOutros == 3 && opcoes == 1) {
				outrosCalmos = outrosCalmos + 1;
			}
			if (idade > 40 && opcoes == 2) {
				idade40Nervosas = idade40Nervosas + 1;
			}
			if (idade < 18 && opcoes == 1) {
				menos18Calmas = menos18Calmas + 1;
			}
			
						
		}
		
		System.out.println("O número de pessoas calmas: " + pessoasCalmas );
		System.out.println("O número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("O número de homens agressivos: " + homensAgressivos);
		System.out.println("O número de outrosCalmos" + outrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos:" + idade40Nervosas);
		System.out.println("O númenos de pessoas calmas com menos de 18 anos: " + menos18Calmas);
		
		entrada.close();
	}

	
}
