import java.util.Scanner;

public class SomarDoisNumeros {
	public static void main(String[] args) {
		// Declaração de variáveis
		int num1, num2, soma;
		Scanner sc = new Scanner(System.in);
		
		// Leituras
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		
		// Somar
		soma = num1 + num2;
		
		// Mostrar na tela
		System.out.println("Soma:" + soma);
	}
	
}
