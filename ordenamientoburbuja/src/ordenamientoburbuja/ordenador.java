package ordenamientoburbuja;

public class ordenador{

	public void ordenarBurbuja(int [] array)
	{
		int aux;
		
	/*Algoritmo Burbuja forma 1
	 		
		for (int j = 0; j < array.length; j++)
		{
			for(int i = j+1; i < array.length; i++)
				{
					if(array[j] > array[i])
					{
						aux = array[j];
						array[j] = array[i];
						array[i] = aux;
					}
				}
		} */
		
		boolean cambios = false;
		
		while(true)
		{
			cambios = false;
			
			for(int i = 1; i < array.length; i++)
			{
				if(array[i] < array[i-1])
				{
					aux = array[i-1];
					array[i-1] = array[i];
					array[i] = aux;
					cambios = true;
					
				}
			}
			
			if (cambios==false)
				break;
			
		}
	
	}
}