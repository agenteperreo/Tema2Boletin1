package tema2boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaramos las variables
		int num1, num2;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los numeros
		System.out.print("Dime el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Dime el segundo numero: ");
		num2 = sc.nextInt();

		// Condicional para seber quien es mayor
		if (num1 > num2) {
			System.out.println(num1 + " - " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " - " + num1);
		} else {
			System.out.println("Los numero son iguales: " + num1 + " = " + num2);
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
