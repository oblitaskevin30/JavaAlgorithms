package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args){
		System.out.println("Hola Fizz Buzz : ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] arregloNum = new int[num];
		

		System.out.println(num);
		



		for(int i = 0 ; i < num ; i++){
			if ( i % 15 == 0 ) {
				System.out.println(" FizzBuzz ");
				arregloNum[i] = i ;
			} else if ( i % 3 == 0) {
				System.out.println("Fizz");
				arregloNum[i] = i ;
			} else if ( i % 5 == 0){
				System.err.println("Buzz");
				arregloNum[i] = i ;
			}
		}

		for(int numero  : arregloNum){
			System.out.println(numero);
		}

		sc.close();
	}
}
