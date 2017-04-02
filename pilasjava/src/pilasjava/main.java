package pilasjava;

import java.util.Stack;

public class main {
	
	/**ejercicios de pilas
	 * push
	 * pop
	 * peek para ver cual es el ultimo dato en la pila
	 * empty
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FILO  first-in, last-out
		
		Stack pila = new Stack();
		pila.push(50); //indice 0
		pila.push("String");//indice 1
		
		//solo se puede obtener el ultimo valor
		//peek para ver, y el metodo pop para obtener
		
		System.out.println("El ultimo elemento de la pila es: "+pila.peek());

		while(pila.empty() == false)
		{
			System.out.println(pila.pop());
		}
	}

}
