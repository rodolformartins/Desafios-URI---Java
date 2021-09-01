package exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio2 {
	public static void main(String[] args) {
		
		
//Exercicio URI 1014
		
/* Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto 
* (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), 
e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l". */
		
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
