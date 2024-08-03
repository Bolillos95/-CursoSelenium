package Test;

public class Ejemplo_arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray;
		byte[] bytarray;
		byte bytarray2[];
		boolean[] boolArray;
		
		//Declarar un array de strings
		String[] arr;
		
		//Asignar memoria para 5 strings
		arr = new String[5];
		
		//Inicializar el primer elemento del arreglo
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}
		
		//ejemplo de int enteros
		int[] intArray2 = new int[] {1,2,3,4,5,6,7,8,9,0};

	}

}
