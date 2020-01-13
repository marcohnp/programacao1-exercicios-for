import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		/* Fazer um algoritmo para receber números decimais até que o usuário
		digite 0 e fazer a média aritmética desses números. */
		
		Scanner sc = new Scanner(System.in);
		int num, cont = 0;
		double soma = 0, media;
		
		System.out.println("Digite números para realizar a média ou digite '0' para sair.");
		num = sc.nextInt();
		
		if (num != 0) {
			for (cont = 0; num > 0; cont++) {
				soma = soma + num;
				num = sc.nextInt();	
			} 
			media = soma / cont;
			System.out.printf("Foram digitados %d números e a média entre eles é: %.2f\n", cont, media);
			System.out.println("Programa Finalizado!");
		} else {
			System.out.println("Programa Finalizado!");
		}
		
		
		
		sc.close();

	}

}
