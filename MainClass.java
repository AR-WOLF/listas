package listas_dobles;

public class MainClass {
public static void main(String args[]) {
		
		ListaEnlazada obj = new ListaEnlazada();
		
		obj.IngresarDato();
		obj.display();
		
		obj.AñadirAlInicio();
		obj.EliminarPrimerElemento();
		obj.AñadirElementoPosicion();
		obj.EliminarElementoPosicion();
		obj.EliminarTodo();
	}
}


