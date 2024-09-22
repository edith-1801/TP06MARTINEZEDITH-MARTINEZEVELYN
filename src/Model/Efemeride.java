package Model;

import util.Mes;

public class Efemeride {
    private int codigo;
    private String nombre;
    private Mes mes;
    private int dia;
    private String detalle;

    public Efemeride(int codigo, String nombre, Mes mes, int dia, String detalle) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.mes = mes;
        this.dia = dia;
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Efemeride{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", mes=" + mes +
                ", dia=" + dia +
                ", detalle='" + detalle + '\'' +
                '}';
    }

	public void setNombre(String string) {
		// TODO Auto-generated method stub
		
	}
}

