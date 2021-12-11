package br.com.generation.exercicios1012;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
        int numero, soma = 0;
        
        System.out.print("Digite o primeiro numero a ser somado: ");
        	numero = leia.nextInt();
        	soma = soma + numero;

        do {
        	System.out.print("Digite o próximo numero a ser somado: ");
            
            numero = leia.nextInt();
            
            soma = soma + numero;
            }
        
        while (numero != 0);
        
        System.out.print("A soma dos numeros inseridos é: " + soma);
        
        leia.close();

	}

}
