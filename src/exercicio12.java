import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		/* Escrever um algoritmo que recebe o sexo (M - Masculino e F - Feminino)
		e a idade. Apresentar no final do algoritmo a m�dia da idade dos homens e a m�dia da idade
		das mulheres. Parar o algoritmo quando for digitado um sexo diferente de M ou F. */
		
		Scanner sc = new Scanner(System.in);
		char sexo; 
		int idade, cont, somaIdadeF = 0, somaIdadeM = 0, contIdadeF = 0, contIdadeM = 0, mediaIdadeF = 0, mediaIdadeM = 0;
		
		System.out.println("Digite o sexo e a idade da pessoa: ");
		
		for (cont = 1; cont > 0; cont++) {
			System.out.print("Sexo (F/M): ");
			sexo = sc.next().charAt(0);
			System.out.print("Idade: ");
			idade = sc.nextInt();
			if (sexo == 'F' || sexo == 'f') {
				somaIdadeF = somaIdadeF + idade;
				contIdadeF++;
			} else if (sexo == 'M' || sexo == 'm') {
				somaIdadeM = somaIdadeM + idade;
				contIdadeM++;
			} else {
				System.out.println("Sexo inv�lido.");
				cont = -1;
			}
			
		}
		
		if (contIdadeM > 0) {
			mediaIdadeM = somaIdadeM / contIdadeM;
			System.out.println("M�dia de idade dos Homens: " + mediaIdadeM);
		} else { 
			System.out.println("N�o foram digitados pessoas do sexo Masculino");
		}
		
		if (contIdadeF > 0) {
			mediaIdadeF = somaIdadeF / contIdadeF;
			System.out.println("M�dia de idade das Mulheres: " + mediaIdadeF);
		} else { 
			System.out.println("N�o foram digitados pessoas do sexo Feminino.");
		}
		
		sc.close();

	}

}
