import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		/* Escreva um algoritmo que receba um n�mero inteiro positivo. Fazer a
		multiplica��o + a impress�o do n�mero recebido iniciando em 1 at� chegar ao n�mero
		recebido (incluindo o n�mero recebido). Parar o algoritmo quando o usu�rio digitar 0. */
		
		Scanner sc = new Scanner(System.in);
		
		int numLido = 1, cont = 1, resultado;
		
		while (cont != 0) {
			System.out.print("Digite um n�mero: ");
			numLido = sc.nextInt();
			for (cont = 1; cont <= numLido; cont++) {
				if (numLido != 0) {
					resultado = numLido * cont;
					System.out.printf("%d * %d = %d.\n", numLido, cont, resultado);
				} else {
					cont = numLido;
				}
				
			}
			if (numLido == 0) {
			cont = 0;	
			}
		}
		System.out.println("Programa Finalizado!");	
		
		sc.close();

	}

}
