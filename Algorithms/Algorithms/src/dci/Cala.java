package dci;

import java.util.ArrayList;
import java.util.Scanner;

public class Cala {
	
	public Cala(){
		
	}
	
	public void esParImpar() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("introduce el numero");
		int num = scan.nextInt();
		scan.close();
		
		if(num!=0) {
			if(num%2==0) {
				System.out.println("es par");
			}
			else {
				System.out.println("es impar");
			}
		}else {
			System.out.println("introduce un numero diferente de cero");
		}
		
		
	}
	
	public void multiplo3o5() {
//		int[] arregloNum = new int[10];
		int[] arregloNum  = {1,2,3,4,5,6,7,8,100,15};
		ArrayList<String> listNum = new ArrayList<String>();
		
		
		for (int i = 0 ; i<arregloNum.length;i++) {
			
				if(arregloNum[i] % 15 == 0) {
					
					listNum.add("FizzBuzz");
				}else if (arregloNum[i] % 5 == 0) {
					
					listNum.add("Buzz");
				}else if(arregloNum[i] % 3 == 0) {
					
					listNum.add("Fizz");
				}else {
					listNum.add(i+"");
				}
			
		}
		
//		for(String string : listNum) {
//			System.out.println(string);
//		}
		System.out.println(listNum.toString());
		
	}

	

}
