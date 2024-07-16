package reservaAsientoAnfiteatro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("lista asientos anfiteatro");

		
		//		dibujamos los asientos y poblamos
		
		char asientos[][] = new char[10][10];
		
		for (int i = 0; i<asientos.length;i++) {
			for (int j = 0 ; j<asientos.length;j++) {
				asientos[i][j] = 'L';
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
		// reservando asiento
		boolean AsientoLibre = false;
		System.out.println("INICIAMOS EL PROCESO DE RESERVA");
		
		while(AsientoLibre!=true) {
			//		Seleccionamos el asiento
			
			int fila;
			int colum;
			
			System.out.println("INGRESE LA FILA (0-9)");
			fila = scan.nextInt();
			
			System.out.println("INGRESE COLUMNA 0 - 9");
			colum = scan.nextInt();
			
			
			
			//			verificamos si el asiento esta ocupado
			if(asientos[fila][colum]=='L') {
				asientos[fila][colum]='X';
				mostrarAsientos(asientos);
				System.out.println("asiento reservado correctamente : ");
			} else {
				System.out.println("el asiento "+ fila+colum + " esta ocupado");
			}
			
			System.out.println("desea continuar reservando :  ingrese S para SI // N para NO");
			String rpta = scan.next();
			if(rpta.equalsIgnoreCase("N")) {
				AsientoLibre = true;
				System.out.println("termino reserva");
			}
			
			
			
		}
		scan.close();

		
	}
	
	static void mostrarAsientos(char[][] asientos) {
		for (int i = 0; i<asientos.length;i++) {
			System.out.print(i);
			for (int j = 0 ; j<asientos.length;j++) {
				System.out.print(j);
				System.out.print("["+asientos[i][j]+"]");
			}
			System.out.println("");
		}
	}
}
