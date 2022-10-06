package tema2boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		//Decalramos las variables
		double num1;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.print("Dime un nunmero decimal entre 1 y -1: ");
		num1 = sc.nextDouble();
		
		//Condicionales para saber si es un numero casi cero
		if (num1>=1 || num1<=-1 || num1==0) {
			System.out.printf("El numero %.2f no es casi-cero",num1);
		}else {
			System.out.printf("El numero %.2f es casi-cero",num1);
		}
		
		//Cerramos el esquema
		sc.close();
	}

}
