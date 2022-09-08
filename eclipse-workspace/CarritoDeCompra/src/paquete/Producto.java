package paquete;

public class Producto {
	String nombre;
	int precio;
	int codigo; 
	
	
	
	

	int calcularTotal(int cantidad) {
		int total = precio * cantidad;
	return total;
	}
	
	
	
}
