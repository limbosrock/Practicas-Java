package paquete;

import java.util.Scanner;

public class carrito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Producto pr1 = new Producto();	
		System.out.println("ingrese NOMBRE de Producto");
		pr1.nombre = teclado.nextLine();
		
		System.out.println("ingrese CODIGO de Producto");
		pr1.codigo = Integer.parseInt(teclado.nextLine());
		
		System.out.println("ingrese PRECIO de Producto");
		pr1.precio = Integer.parseInt(teclado.nextLine());
		
		System.out.println("ingresaste: "+ pr1.nombre + pr1.codigo + " - "+ pr1.precio);
		
		
		System.out.println("declarar cantidad");
		int cantidad = Integer.parseInt(teclado.nextLine());
		
		System.out.println("el precio total es: " + pr1.calcularTotal(cantidad));
		
		
	}

}


