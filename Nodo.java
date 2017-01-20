package listas_dobles;
//
//ALVARO RAFAEL RODRIGUEZ SANCHEZ
//ESTRUCTURA DE DATOS 
//18/01/2017
//

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
 

public class Nodo {
	Scanner scanner;
	LinkedList<String> lista;
	
	int n;
	
	void IngresarDato() {
		
		scanner = new Scanner(System.in);
		lista = new LinkedList<String>();
		
		System.out.println("********************LISTA ENLAZADA****************");
		
		System.out.println("\nINGRESAR CUANTOS ELEMENTOS VA A INGRESAR :");
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
	
	
 
	void AñadirAlFinal() {
		
		System.out.println("\n**********AÑADIR UM ELEMNTO AL FINAL************");
		System.out.println("INGRESAR DATO:");
		String item = scanner.next();
		
		lista.addLast(item);
		
		display();
	}
	
	void EliminarAlFinal() {
		
		System.out.println("\nELIMINAR AL FINAL:");
		
		lista.removeLast();
		
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
 

	


