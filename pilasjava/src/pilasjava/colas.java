package pilasjava;
import java.util.LinkedList; //utilidad para las colas
							//colas es una variacion de las listas enlazadas 
public class colas {
	
	/**
	 * FIFO first.in, first out
	 * 
	 * offer para añadir un dato
	 *  poll obtener un dato
	 * @param args
	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList cola = new  LinkedList();
		
		for(int i=1; i < 11; i++)
			cola.offer(i);
		
		while(cola.peek() != null) //peek no elimina elem de la cola
		{
			System.out.println(cola.poll()); //poll elimina elem de la cola
		
			
		}
		

	}

}
