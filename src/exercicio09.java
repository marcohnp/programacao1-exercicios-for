import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		/* Escreva um programa em Java que deve repetidamente solicitar um
		n�mero e calcular e escrever se n�mero digitado � par. O programa dever� parar quando o
		usu�rio digitar zero (0) ou quando cinco n�meros pares forem identificados. */
		
		Scanner sc = new Scanner(System.in);
		
		int numLido = 1, resto;
		
						
		for (int controlePar = 0; controlePar < 5; controlePar++) {
			System.out.print("Digite um n�mero: ");
			numLido = sc.nextInt();
			resto = numLido%2;
			if (numLido != 0) {
				if (resto == 0) {
					System.out.printf("%d � par.\n", numLido);
				} else {
					System.out.printf("%d � �mpar. \n", numLido);
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
