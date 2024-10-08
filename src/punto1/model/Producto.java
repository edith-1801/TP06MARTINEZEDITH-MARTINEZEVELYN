package punto1.model;

import punto1.util.Categoria;
import punto1.util.OrigenFabricacion;

public class Producto {
	private String codigo;
	 private String descripcion;
	 private Double precioUnitario;
	 private OrigenFabricacion origenFabricacion;
	 private Categoria categoria;
	 
	 public Producto (String codigo, String descripcion, Double precioUnitario, OrigenFabricacion origenFabricacion, Categoria categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.origenFabricacion = origenFabricacion;
        this.categoria = categoria;
        
        
	 }

	    public String getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public Double getPrecioUnitario() {
	        return precioUnitario;
	    }

	    public void setPrecioUnitario(Double precioUnitario) {
	        this.precioUnitario = precioUnitario;
	    }

	    public OrigenFabricacion getOrigenFabricacion() {
	        return origenFabricacion;
	    }

	    public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
	        this.origenFabricacion = origenFabricacion;
	    }

	    public Categoria getCategoria() {
	        return categoria;
	    }

	    public void setCategoria(Categoria categoria) {
	        this.categoria = categoria;
	    }

	    @Override
	    public String toString() {
	        return "Producto{" +
	                "codigo='" + codigo + '\'' +
	                ", descripcion='" + descripcion + '\'' +
	                ", precioUnitario=" + precioUnitario +
	                ", origenFabricacion=" + origenFabricacion +
	                ", categoria=" + categoria +
	                '}';
	    }
	}


