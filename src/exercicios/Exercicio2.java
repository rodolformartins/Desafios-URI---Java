package exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio2 {
	public static void main(String[] args) {
		
		
//Exercicio URI 1014
		
/* Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) e o total de combust�vel gasto 
* (em litros).

Entrada
O arquivo de entrada cont�m dois valores: um valor inteiro X representando a dist�ncia total percorrida (em Km), 
e um valor real Y representando o total de combust�vel gasto, com um d�gito ap�s o ponto decimal.

Sa�da
Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas ap�s a v�rgula, seguido da mensagem "km/l". */
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.000");
		
		int valorPercorridoKM = 0;
		float combustivelGasto = 0;
		
		
		
		//Coletando os dados do usuario
		valorPercorridoKM = scan.nextInt();
		combustivelGasto = scan.nextFloat();
		
		double consumoMedio = valorPercorridoKM / combustivelGasto;
		
		
		System.out.println(formatador.format(consumoMedio) + " km/l");
		
		
		
		
	}
}
