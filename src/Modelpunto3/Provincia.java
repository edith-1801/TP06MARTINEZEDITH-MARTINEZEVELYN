package Modelpunto3;

import utilpunto3.Region;

public class Provincia {
    private int identificador;
    private String nombre;
    private Region region;
    private int habitantes;
    private double superficie;
    private boolean estado;

    public Provincia(int identificador, String nombre, Region region, int habitantes, double superficie, boolean estado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.region = region;
        this.habitantes = habitantes;
        this.superficie = superficie;
        this.estado = estado;
    }

    public double calcularDensidadPoblacional() {
        return habitantes / superficie;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", region=" + region +
                ", habitantes=" + habitantes +
                ", superficie=" + superficie +
                ", estado=" + estado +
                '}';
    }

	public boolean isEstado() {
		// TODO Auto-generated method stub
		return false;
	}
}
