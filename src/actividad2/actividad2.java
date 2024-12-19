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
	}

}
