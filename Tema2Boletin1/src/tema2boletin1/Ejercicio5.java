package tema2boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		int num1, num2, num3;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los numeros
		System.out.print("Dime un numero: ");
		num1=sc.nextInt();
		System.out.print("Dime otro numero: ");
		num2=sc.nextInt();
		System.out.print("Dime y un ultimo numero: ");
		num3=sc.nextInt();
		
		//Condicionales para saber el orden
		if (num1>num2 && num1>num3) { //Si es True sabemos que num1 es el mayor
			if (num2>num3) { //Si es True sabemos que num2 es el segundo y num3 el tercero
				System.out.printf("%d, %d y %d",num1,num2,num3); //Lo mostramos
			} else { //Si es False sabemos que num3 es el segundo y num2 el tercero
				System.out.printf("%d, %d y %d",num1,num3,num2); //Lo mostramos
			}
		}else { //Si es False tendremos que comprobar otras variables
			if (num3>num2) { //Si es True sabemos que num3 es el mayor
				if (num2>num1) { //Si es True sabemos que num2 es el segundo y num1 el tercero
					System.out.printf("%d, %d y %d",num3,num2,num1); //Lo mostramos
				}else { //Si es False sabemos que num1 es el segundo y num2 el tercero
					System.out.printf("%d, %d y %d",num3,num1,num2); //Los mostramos
				}
			}else { //Si es False sabemos, por descarte que num2 es el mayor
				if (num3>num1) { //Si es True sabemos que num3 es el segundo y num1 el tercero
					System.out.printf("%d, %d y %d",num2,num3,num1); //Lo mostramos
				}else { //Si es False sabemos que num1 es el segundo y num3 el tercero
					System.out.printf("%d, %d y %d",num2,num1,num3); //Lo mostramos
				}
			}
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
