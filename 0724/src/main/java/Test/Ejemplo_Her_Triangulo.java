package Test;

public class Ejemplo_Her_Triangulo extends Ejemplo_Her_DosDimensiones{
	
	String estilo;
	
	public double area() {
		return base* altura/2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}

}
