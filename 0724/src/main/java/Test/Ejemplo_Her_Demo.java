package Test;

public class Ejemplo_Her_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejemplo_Her_Triangulo t1 = new Ejemplo_Her_Triangulo();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = "Estilo 1";
		
		System.out.println("Informacion para T1 : ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: " + t1.area());
		
		System.out.println();
		
		Ejemplo_Her_Triangulo t2 = new Ejemplo_Her_Triangulo();
		
		t2.base = 8.0;
		t2.altura = 12.0;
		t2.estilo = "Estilo 2";
		
		System.out.println("Informacion para T2 : ");
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es: " + t2.area());
		
		System.out.println();
		
		

	}

}
