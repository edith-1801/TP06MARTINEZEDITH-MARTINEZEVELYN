package punto4.model;

import java.util.Date;
import punto1.model.Producto;

public class Compra {
	private String codigo;
    private Date fechaCompra;
    private Producto producto;
    private int cantidad;

    public Compra(String codigo, Date fechaCompra, Producto producto, int cantidad) {
        this.codigo = codigo;
        this.fechaCompra = fechaCompra;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para calcular el precio total
    public double calcularPrecioTotal() {
        return producto.getPrecioUnitario() * cantidad;
    }

    // Método para imprimir el recibo
    public void imprimirRecibo() {
        System.out.println("Recibo de Compra:");
        System.out.println("Código de Compra: " + codigo);
        System.out.println("Fecha de Compra: " + fechaCompra);
        System.out.println("Producto: " + producto.getDescripcion());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: " + producto.getPrecioUnitario());
        System.out.println("Precio Total: " + calcularPrecioTotal());
        System.out.println("----------------------------");
    }

}
