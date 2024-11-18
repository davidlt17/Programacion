public class Tienda {
    private String producto;
    private double precio;
    private double iva;
    private double descuento;
    private static int numProductos = 0;
    private static double descuentoGlobal = 0;

    public Tienda(String producto, double precio, double iva, double descuento) {
        this.producto = producto;
        this.precio = precio;
        this.iva = iva;
        this.descuento = descuento;
        numProductos++;
    }

    public Tienda(String producto) {
        this(producto, 10, 21, 0);
    }

    public static int getNumProductos() {
        return numProductos;
    }

    public static void setDescuentoGlobal(double descuento) {
        descuentoGlobal = descuento;
    }

    public double calcularPrecio() {
       if (descuentoGlobal>descuento) {
           double precioFinal = precio - (precio * (descuentoGlobal / 100)) + (precio * (iva / 100));
           return precioFinal;
       }
       else{
           double precioFinal= precio-(precio*(descuento/100)+(precio*(iva/100)));
           return precioFinal;
       }
    }

    @Override
    public String toString() {
        return "Producto: " + this.producto + ", Precio final: " + calcularPrecio();
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}

