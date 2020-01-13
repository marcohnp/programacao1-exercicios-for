import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		/* Escreva um programa em Java que deve repetidamente solicitar um
		número e calcular e escrever se número digitado é par. O programa deverá parar quando o
		usuário digitar zero (0) ou quando cinco números pares forem identificados. */
		
		Scanner sc = new Scanner(System.in);
		
		int numLido = 1, resto;
		
						
		for (int controlePar = 0; controlePar < 5; controlePar++) {
			System.out.print("Digite um número: ");
			numLido = sc.nextInt();
			resto = numLido%2;
			if (numLido != 0) {
				if (resto == 0) {
					System.out.printf("%d é par.\n", numLido);
				} else {
					System.out.printf("%d é ímpar. \n", numLido);
					controlePar--;
				}
			} else { 
				controlePar = 5;
			}
				
		}
		
		System.out.println("Programa Finalizado!");
		
		sc.close();
	}

}
