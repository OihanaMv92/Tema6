package es.studium.tema6;

public class ej1Fallo
{
	public static void main(String[] args)
	{
		int i = 0;
		String vectorS [] = {"Hola mundo 1", "Hola mundo 2", "Hola mundo 3"};
		while (i < 4 )
		{
			try
			{
				System.out.println(vectorS[i]);
			}
			catch(Exception e)
			{
				Error err = new Error(e);
				System.out.println("Se ha producido el error:" + err);
			}
			i++;
		}
	}
}

