

package tema2boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		//Declaramos las variables
		int num;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.print("Dime un numero para decirte si es par: ");
		num=sc.nextInt();
		
		//Condicional para saber si es par o impar
		if (num%2 == 0) { //Si el resto de el numero entre 2 es 0 es par
			System.out.println("El numero " + num + " es par");
		}else { //Si el resto es mayor que 0 es inpar
			System.out.println("El numero " + num + " es inpar");
		}
		
		sc.close();
		
	}

}
