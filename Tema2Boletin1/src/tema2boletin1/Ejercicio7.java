package tema2boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		//Declaramos las variables
		int num;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.print("Dime un numero entre el 0 y el 99.999: ");
		num=sc.nextInt();
		
		//Condicional para saber cuantas cifras tiene
		if (num<10) { //Si es menro que 10 tiene una cifra
			System.out.println("El numero tiene una cifra."); //Lo mostramos
		}else if (num<100) {//Si es menor que 100 tiene dos cifras
			System.out.println("El numero tiene dos cifras."); //Lo mostramos
		}else if (num<1000) {//Si es menor que 1000 tiene tres cifras
			System.out.println("El numero tiene tres cifras."); //Lo mostramos
		}else if (num<10000) {//Si es menor que 10000 tiene cuatro cifras
			System.out.println("El numero tiene cuatro cifras."); //Lo mostramos
		}else if (num<100000) {//Si es menor que 100000 tiene cinco cifras
			System.out.println("El numero tiene cinco cifras."); //Lo mostramos
		}else { //Si no esta en los if anteriores no esta en el intervalo marcado
			System.out.println("El numero no esta en el intervalo marcado."); //Lo mostramos
		}
		
		sc.close();
		
	}

}
