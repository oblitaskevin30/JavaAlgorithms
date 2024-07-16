package dci;

import dci.Cala;

public class Main {
	public static void main(String[] args) {
		System.out.println("odd or even program");
		
		Cala prueba1 = new Cala();
		prueba1.esParImpar();
		
		nombreMetodo();
		
		prueba1.multiplo3o5();
	}
	
	public static void nombreMetodo() {
		System.out.println("hola metodo nombre metodo estatico "); 
	}
	
	

}
