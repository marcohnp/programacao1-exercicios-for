
public class exercicio08 {

	public static void main(String[] args) {
		/* Escreva um algoritmo para imprimir os 50 primeiros n�meros primos
		maior que 100. Obs.: N�mero primo � aquele divis�vel somente por 1 e ele mesmo. */
		
		int num, divisor, contPrimo = 0, totalDivisor = 0;
		
		System.out.println("Os 50 primeiros n�meros primos depois de 100 s�o: ");
		
		for (num = 100; contPrimo <=50; num++) {
			for (divisor = 2; divisor <= num; divisor++) {
				if (num % divisor == 0) {
					totalDivisor++;
				}
			} 
			if (totalDivisor == 1) {
			System.out.println(num + " � n�mero primo.");
			contPrimo++;
			} /*else {
			System.out.println(num + " n�o � n�mero primo");
			}*/
			totalDivisor = 0;
		}
		
	}	

}


