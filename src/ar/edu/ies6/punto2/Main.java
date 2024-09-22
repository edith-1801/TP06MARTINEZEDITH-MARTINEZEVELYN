package ar.edu.ies6.punto2;
import 	Model.Efemeride;
import util.Mes;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Efemeride> efemerides = new ArrayList<>();
	        efemerides.add(new Efemeride(1, "Día de la Independencia", Mes.JULIO, 9, "Celebración de la independencia"));
	        efemerides.add(new Efemeride(2, "Día del Trabajador", Mes.MAYO, 1, "Día del trabajador en Argentina"));
	        efemerides.add(new Efemeride(3, "Revolución de Mayo", Mes.MAYO, 25, "Celebración del Primer Gobierno Patrio"));
	        efemerides.add(new Efemeride(4, "Día de la Bandera", Mes.JUNIO, 20, "Conmemoración de Manuel Belgrano"));
	        efemerides.add(new Efemeride(5, "Día del Maestro", Mes.SEPTIEMBRE, 11, "Celebración en honor a Sarmiento"));

	        System.out.println("Lista de efemérides:");
	        for (Efemeride efemeride : efemerides) {
	            System.out.println(efemeride);
	        }

	        // Eliminar la tercera efeméride
	        efemerides.remove(2);

	        // Modificar la segunda efeméride
	        efemerides.get(1).setNombre("Día Internacional del Trabajo");

	        System.out.println("\nLista de efemérides después de cambios:");
	        for (Efemeride efemeride : efemerides) {
	            System.out.println(efemeride);
	        }
	    }
	}

