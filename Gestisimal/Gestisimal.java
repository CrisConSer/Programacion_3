/* Ejercicio 5 - Arrays
* @author: Cristina Conde
*/
class Gestisimal {
public static final int getCodigo = 0;
    private int codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

public Gestisimal(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
}

public int alta() {
    return codigo;
}

public void baja(int codigo) {
    this.codigo = codigo;
}

public String descripcion() {
    return descripcion;
}

public void precioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
}

public String getDescripcion() {
    return descripcion;
}

public String setDescripcion() {
    return descripcion;
}

public double getCodigo() {
    return codigo;
}

public double setCodigo() {
    return codigo;
}

public double getPrecioCompra(double precioCompra) {
return precioCompra;
}

public void setPrecioCompra(double precioCompra) {
this.precioCompra = precioCompra;
}

public double getPrecioVenta() {
return precioVenta;
}

public void setPrecioVenta(double precioVenta) {
this.precioVenta = precioVenta;
}

public int getStock() {
return stock;
}

public void setStock(int stock) {
    this.stock = stock;
    }

    @Override
    public String toString() {
    return "Código: " + codigo + ", Descripción: " + descripcion + ", Precio de compra: " + precioCompra
    + ", Precio de venta: " + precioVenta + ", Stock: " + stock;
    }
}

