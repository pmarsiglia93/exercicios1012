package br.com.generation.exercicios1012;

public class Ex01For {

	public static void main(String[] args) throws InterruptedException {
					
		for(int i = 1000; i<= 1999; i++)
				if (i % 11 == 5) {
				System.out.println("O valor divido por 11 com resto 5 é: " + i);
				Thread.sleep(200);
			}
	}

}
