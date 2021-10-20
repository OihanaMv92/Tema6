package es.studium.tema6;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1Tema6
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1 =
		0;
		System.out.println("Dame un numero entero: ");
		try {
			num1 = teclado.nextInt();
		}
		catch(InputMismatchException error) {
			System.out.println("No metiste un numero entero melon!");

		}
		finally {
			System.out.println("El numero introducido es: " + num1);
			teclado.close();
		}
	}

}



