package paqueteOxO;

/*Mis primeras Modificaciones de GitHub
HOLa*/

public class pelota {
	float radio;
	float peso;
	
	//constructor
	public pelota()
	{
		radio = 100;
		peso = 250;
	}
	
	//constructor parametrico
	public pelota(float radio, float peso)
	{
		this.radio = radio;
		this.peso = peso;
	}
	
	public float obtenerradio()
	{
		return radio;
	}
	
	public float obtenerpeso()
	{
		return peso;
	}
	
	public void patearpelota()
	{
		System.out.println("haz paleado la pelota");
	}
	
	public void atraparpelota()
	{
		System.out.println("haz atrapado la pelota");
	}
	

}
