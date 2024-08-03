package Test;

public class Ejemplo_Clase_DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejemplo_Clase_Vehiculo minivan = new Ejemplo_Clase_Vehiculo();
		
		int rango;
		
		//Asignando valores para los parametros de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rangod e km asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar" + minivan.pasajeros + "pasajeros con un rango de " + rango + " km");
		
		Ejemplo_Clase_Vehiculo carro = new Ejemplo_Clase_Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numero de psajeros en carro es: " + carro.pasajeros);
		


	}

}
