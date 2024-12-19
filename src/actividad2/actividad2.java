package actividad2;

import java.util.*;

public class actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sumar todos los elementos de la matriz.
		int suma = 0;
		for (int i = 0; i < FILAS; i++) {
		    for (int j = 0; j < COLUMNAS; j++) {
		        suma += matriz[i][j];
		    }
		}

		// Mostrar la suma de todos los elementos.
		System.out.println("La suma de todos los elementos de la matriz es: " + suma);

		
	}

}
