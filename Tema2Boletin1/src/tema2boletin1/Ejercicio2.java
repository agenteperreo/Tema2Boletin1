package tema2boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaramos las variables
		int num1, num2;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los 2 numeros
		System.out.print("Dime un numero: ");
		num1 = sc.nextInt();
		System.out.print("Dime un ultimo numero: ");
		num2 = sc.nextInt();

		// Condicional par saber si son iguales
		if (num1 == num2) {
			System.out.printf("Los numeros %d y %d son iguales",num1,num2);
		} else {
			System.out.printf("Los numeros %d y %d son diferentes",num1,num2);
		}
	}

}
