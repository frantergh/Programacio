import java.util.Scanner;

/**
 * 
 */

/**
 * @author frant 1ºDAM media de los numeros pares e impares
 */
public class Ejer1Arrays_imparspars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int contpar = 0;
		int contimpar = 0;
		int sumanumerospares = 0;
		int sumanumerosimpares = 0;
		int numeros[] = new int[10];

		System.out.println("Dame dies numeros");

		for (int j = 0; j < numeros.length; j++) {
			numeros[j] = teclado.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {
				sumanumerospares = sumanumerospares + numeros[i];
				contpar++;

			} else {
				sumanumerosimpares = sumanumerosimpares + numeros[i];
				contimpar++;
			}

		}
		System.out.println();
		System.out.println("La media de los numeros pares es " + sumanumerospares / contpar);
		System.out.println("La media de los numeros impares es " + sumanumerosimpares / contimpar);

	}

}
