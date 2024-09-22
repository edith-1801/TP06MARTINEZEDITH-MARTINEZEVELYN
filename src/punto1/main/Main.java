package punto1.main;

import punto1.model.Producto;
import punto1.util.Categoria;
import punto1.util.OrigenFabricacion;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Producto> productos = new ArrayList<>();

		  productos.add(new Producto("001", "Teléfono móvil", 50000.0, OrigenFabricacion.CHINA, Categoria.TELEFONIA));
	        productos.add(new Producto("002", "Notebook", 150000.0, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA));
	        productos.add(new Producto("003", "Lavarropas", 75000.0, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
	        productos.add(new Producto("004", "Taladro", 35000.0, OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS));
	        productos.add(new Producto("005", "Monitor", 45000.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));

	        for (Producto producto : productos) {
	            System.out.println(producto);
	        }
	    }
	}
