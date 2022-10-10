package tema2boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaramos las variables
		double a, b, c; //Variables del polinomio a calcular
		double x, y; //Resultado de x cuando la raiz es + y cuando la raiz es -

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los valores de a, b y c
		System.out.print("Valor de a: ");
		a = sc.nextInt();
		System.out.print("Valor de b: ");
		b = sc.nextInt();
		System.out.print("Valor de c: ");
		c = sc.nextInt();

		// Caculamos los 2 resultados de x
		x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		y = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

		//Condicional para saber si tiene solucion o no
		if ((b * b - 4 * a * c) < 0) { //Si lo de dentro de la raiz es negativo no tiene solucion
			System.out.println("Los valores dados no tienen solucion");
		} else { //Si no mostramos el resultado
			System.out.println("Los valores de x son: " + x + " y " + y);
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
