package main;

import java.util.Scanner;

public class OrdenadorNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] arreglo = new int[4];
		
		for ( int i = 0; i < arreglo.length; i++ ) {
			arreglo[i] = teclado.nextInt();
			
		}
				
				
		for ( int i = 0; i < arreglo.length; i++ ) {
		
			System.out.println(arreglo[i]);
		}
		
		
		
	}

}
