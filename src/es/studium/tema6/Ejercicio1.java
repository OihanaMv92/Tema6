package es.studium.tema6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduce un numero entero: ");
		try
		{
			numero = teclado.nextInt(); // g ENTER
			System.out.println("El n�mero introducido es el " + numero);
		}
		catch(InputMismatchException error)
		{
			teclado.next(); // teclado vac�o
			System.out.println("Debes introducir un n�mero entero");
			try
			{
				numero = teclado.nextInt();
				System.out.println("El n�mero introducido es el " + numero);
			}
			catch(Exception error2)
			{
				teclado.nextLine();
				System.out.println("�ltimo intento: Debes meter un entero...");
				numero= teclado.nextInt();

			}
		}
		catch(Exception error)
		{
			System.out.println("Error desconocido");
			System.out.println(error.getMessage());
		}
		finally
		{
			teclado.close();
		}
	}
}