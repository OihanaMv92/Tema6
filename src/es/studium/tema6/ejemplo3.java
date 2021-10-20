package es.studium.tema6;

public class ejemplo3
{

	public static void main(String[] args)
	{
		int valor=5, cero=0;
		int[] array = {1, 2, 3};
		try
		{
			try
			{
				valor = valor/cero; // División por cero
				array[4]= 5; // Acceso a una posición no disponible
			}
			catch(ArithmeticException e)
			{
				System.out.println( "División por cero" );
				throw e;
			}
			catch(Exception e)
			{
				System.out.println("Se ha producido un error:"+e.getMessage());
			}
		}
		catch(Exception e)
		{
			System.out.println( "Se ha producido otro error:"+ e.getMessage());
		}
	}
}