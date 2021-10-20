package es.studium.tema6;

import java.util.Scanner;

public class DIVISION
{

	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		int num1,num2;
		System.out.println("Dame un numero entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame un numero entero: ");
		num2 = teclado.nextInt();
		int r = num1/num2;
		System.out.println("el resultado es: " +r);
		teclado.close();
	
			
	}

}
