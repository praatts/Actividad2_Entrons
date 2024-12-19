package actividad2;


import java.util.*;

public class actividad2 {

	public static void main(String[] args) {

		final int COLUMNAS = 5;
		final int FILAS = 5;
		int[][] matriz = new int[FILAS][COLUMNAS];
		Random nums = new Random();

		// bucle que recorre la matriz y lo rellena con el random.
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				matriz[i][j] = nums.nextInt(101);
			}
		}

		//Imprimo el bucle y lo muestro por pantalla.
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		Scanner s = new Scanner(System.in);
		boolean numeroEncontrado = false;
		
		
		//Pide un número al usuario que quiera comprobar si está en la matriz.
		
		System.out.println("Introduce el número que quieres comprobar si está en la matriz");
		int numABuscar = s.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (numABuscar == matriz[i][j]) {
					System.out.println("Se ha encontrado el número en la matriz!");
					numeroEncontrado = true;
					break;
				} 
			}
			if (numeroEncontrado) {
				break;
			}
			
		}
		
		if (!numeroEncontrado) {
			System.out.println("No se ha encontrado el número de la matriz.");
		}
		

	}

}
