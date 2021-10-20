package es.studium.tema6;

public class ejemplo2
{

	public static void main(String[] args)
	{
		//Aqui poner el try
		int valor=5, cero=0;
		int[] array = {1, 2, 3};
		try // Sacar el try 
		{
			valor = valor/cero; // División por cero
			array[4]= 5; // Acceso a una posición no disponible
		}
		catch(ArithmeticException e)
		{
			System.out.println( "División por cero" );
		}
		catch(Exception e)
		{
			System.out.println( "Se ha producido un error" + e.getMessage());
		}
	}
}

