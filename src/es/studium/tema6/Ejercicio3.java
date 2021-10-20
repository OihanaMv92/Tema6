package es.studium.tema6;

public class Ejercicio3
{

	public static void main(String[] args)
	{
		int tabla[] = new int[10];
		for (int i=0; i<10; i++)
		{
			tabla[i] = i;
		}
		for (int i=0; i<15; i++)
		{
			try {


				System.out.println(tabla[i]);
			}
			catch (ArrayIndexOutOfBoundsException error) // ArrayIndexOutOfBoundsException te sales de array
			{
				System.out.println("Imposible melon te sales del array");
			}
		}
	}

}
