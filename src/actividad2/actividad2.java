package actividad2;
import java.util.Scanner;
import java.util.Random;
public class actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int matriz[][] = new int[2][2];
		boolean numeroEncontrado = false;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(5);
			}
		}
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
