package exercicios;

import java.util.Scanner;



public class Exercicio1 {
	public static void main(String[] args) {
		
			//Exercício 1020
		
	       Scanner scan = new Scanner(System.in);
			
			//Informando a idade em dias
		    int idadeEmDias = scan.nextInt();
		    
		    int ano = idadeEmDias / 365;
		    int resto = idadeEmDias % 365;
		    int meses = resto / 30;
		    int dias = resto - meses * 30;
		    
		    
		    System.out.println(ano + " ano (s)");
		    System.out.println(meses + " mes (es)");
		    System.out.println(dias + " dia (s)");
	}
}
