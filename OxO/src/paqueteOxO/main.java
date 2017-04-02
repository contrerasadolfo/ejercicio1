package paqueteOxO;
import paqueteOxO.pelota;

public class main {

	public static void main(String[] args) {
		
		pelota p1 = new pelota();
		pelota p2 = new pelota(300,23);
		
		System.out.println("la pelota pesa1 pesa: "+p1.obtenerpeso());
		System.out.println("la pelota pesa2 pesa: "+p2.obtenerpeso());
		

	}

}