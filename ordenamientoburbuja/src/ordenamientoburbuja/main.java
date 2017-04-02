package ordenamientoburbuja;

import ordenamientoburbuja.ordenador;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arreglo = {5,3,4,2,0,12,4,6,1};
		ordenador o = new ordenador();
		o.ordenarBurbuja(arreglo);
		
		for (int i = 0; i < arreglo.length; i++)
		{
			System.out.println(arreglo[i]);
		}
		
	}
}