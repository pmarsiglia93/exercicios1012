package br.com.generation.exercicios1012;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
	    int cont = 0;
	    
	     do {
	    	
	    	System.out.print("Digite o número a ser somado: ");	       
	        num = leia.nextInt();
	        
	        if(num % 3 == 0 && num != 0){               
	        soma = soma + num;
	        cont++;
	        	}       
	        }
	    
	     	while (num!= 0);
	    
	     	if (cont == 0) {
	     		System.out.println("Nenhum número divisivel por 3 foi digitado: ");
	     	}
	    
	    else{
	    System.out.print("A média dos numeros inseridos é: " + (soma / cont));
	    }	   
	    leia.close();

	}

}
