package programa.eclipse.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		System.out.println("Digite seu primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite seu segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int multiplicacao = multiplicacao(a,b);
		int subtracao = subtracao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(multiplicacao);
		System.out.println(subtracao);
		System.out.println(divisao);
		
		
	}

		public static int soma (int a, int b) {
			return a + b;
		}		
		
		public static int multiplicacao (int a, int b) {
			return a * b;
		}		
		
		public static int subtracao (int a, int b) {
			return a - b;
		}		
		
		public static int divisao (int a, int b) {
			return a / b;
		}		



}

