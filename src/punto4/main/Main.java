package punto4.main;

import punto4.model.Compra;
import punto1.model.Producto;
import punto1.util.Categoria;
import punto1.util.OrigenFabricacion;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un array con 10 productos
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto("001", "Teléfono móvil", 50000.0, OrigenFabricacion.CHINA, Categoria.TELEFONIA));
        productos.add(new Producto("002", "Notebook", 150000.0, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA));
        productos.add(new Producto("003", "Lavarropas", 75000.0, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
        productos.add(new Producto("004", "Taladro", 35000.0, OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS));
        productos.add(new Producto("005", "Monitor", 45000.0, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
        productos.add(new Producto("006", "Impresora", 20000.0, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA));
        productos.add(new Producto("007", "Aspiradora", 30000.0, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
        productos.add(new Producto("008", "Smartwatch", 25000.0, OrigenFabricacion.CHINA, Categoria.TELEFONIA));
        productos.add(new Producto("009", "Microondas", 40000.0, OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR));
        productos.add(new Producto("010", "Sierra eléctrica", 60000.0, OrigenFabricacion.ARGENTINA, Categoria.HERRAMIENTAS));

        // Crear un array con 3 compras
        ArrayList<Compra> compras = new ArrayList<>();

        // Crear tres compras con diferentes productos y cantidades
        compras.add(new Compra("C001", new Date(), productos.get(0), 2)); // Compra de Teléfono móvil
        compras.add(new Compra("C002", new Date(), productos.get(2), 1)); // Compra de Lavarropas
        compras.add(new Compra("C003", new Date(), productos.get(4), 3)); // Compra de Monitor

        // Mostrar las tres compras usando el método imprimirRecibo
        for (Compra compra : compras) {
            compra.imprimirRecibo();
        }
    }

}
