package listas_dobles;

public class MainClass {
public static void main(String args[]) {
		
		ListaEnlazada obj = new ListaEnlazada();
		
		obj.IngresarDato();
		obj.display();
		
		obj.AņadirAlInicio();
		obj.EliminarPrimerElemento();
		obj.AņadirElementoPosicion();
		obj.EliminarElementoPosicion();
		obj.EliminarTodo();
	}
}


