package es.studium.tema6;

public class ej1
{

	public static void main(String[] args)
	{
		int i = 0;
		String vectorS [] = {"Hola mundo 1", "Hola mundo 2", "Hola mundo 3"};
		while (i < 4 ) // Para evitar fallo poner un 3.
		{
			System.out.println(vectorS[i]);
			i++;
		}
	}
}