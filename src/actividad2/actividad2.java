package actividad2;
import java.util.Scanner;
public class actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		//Pide un número al usuario que quiera comprobar si está en la matriz.
		
		System.out.println("Introduce el número que quieres comprobar si está en la matriz");
		int numABuscar = s.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (numABuscar == matriz[i][j]) {
					System.out.println("Se ha encontrado el número en la matriz!");
				} 
			}
		}
		
	}

}
