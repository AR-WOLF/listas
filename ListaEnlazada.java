package listas_dobles;
//
//ALVARO RAFAEL RODRIGUEZ SANCHEZ
//ESTRUCTURA DE DATOS 
//18/01/2017
//

import java.util.LinkedList;
import java.util.Scanner;
 

public class ListaEnlazada {
	Scanner scanner;
	LinkedList<String> lista;
	
	int n;
	
	void IngresarDato() {
		
		scanner = new Scanner(System.in);
		lista = new LinkedList<String>();
		
		System.out.println("********************LISTA ENLAZADA****************");
		
		System.out.println("\nINGRESE UNA CANTIDAD DE NUMEROS:");
		n = scanner.nextInt();
		
		System.out.println("INGRESAR VALORES:");
 
		for(int i=0; i<n; i++) {
			
			lista.add(scanner.next());
		}
	}
	
	void display() {
		
		System.out.println("\nLISTA ENLAZADA:");
 
		for(int i=0; i<lista.size(); i++) {
			
			System.out.println(lista.get(i));
		}
	}
	
void AñadirAlInicio() {
		
		System.out.println("\n*************AÑADIR AL INICIO************");
		System.out.println("INGRESE UN DATO:");
		String item = scanner.next();
		
		lista.addFirst(item);
		
		display();
	}
	
	void EliminarPrimerElemento() {
		
		System.out.println("\n****************ELIMINAR PRIMER ELEMENTO**********:");
		
		lista.removeFirst();
		
		display();
	}
	
	void AñadirElementoPosicion() {
		
		System.out.println("\n****************AÑADIR UN ELEMENTO A LA LISTA SEGUN LA POSICION**************");
		
		System.out.println("INGRESE LA POSICION");
		int index = scanner.nextInt();
		
		System.out.println("INGRESE EL VALOR");
		String item = scanner.next();
		
		lista.add(index - 1, item);
		
		display();
	}
	
	void EliminarElementoPosicion() {
		
		System.out.println("\n*********************ELIMINAR UNA POSICION*********************");
		
		System.out.println("POSICION:");
		int index = scanner.nextInt();
		
		lista.remove(index-1);
		
		display();
	}
	
void EliminarTodo() {
		
		System.out.println("\n*************************ELIMINAR TODO? (Y/N)******************");
		String result = scanner.next(); 
 
		if(result.equalsIgnoreCase("Y"))
			lista.clear();
		
		display();
	}
}
 

	


