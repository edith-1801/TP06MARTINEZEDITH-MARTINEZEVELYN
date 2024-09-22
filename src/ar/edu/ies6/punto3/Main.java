package ar.edu.ies6.punto3;

import Modelpunto3.Provincia;
import utilpunto3.Region;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Provincia> provincias = new ArrayList<>();
        provincias.add(new Provincia(1, "Buenos Aires", Region.CENTRO, 16800000, 307571, true));
        provincias.add(new Provincia(2, "Mendoza", Region.CUYO, 2000000, 148827, true));
        provincias.add(new Provincia(3, "Salta", Region.NOA, 1400000, 155488, false));

        for (Provincia provincia : provincias) {
            System.out.println(provincia);
            System.out.println("Densidad poblacional: " + provincia.calcularDensidadPoblacional());
        }

        System.out.println("\nProvincias con estado true:");
        for (Provincia provincia : provincias) {
            if (provincia.isEstado()) {
                System.out.println(provincia);
            }
        }
    }
}
