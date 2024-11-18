public class MainTienda {
        public static void main(String[] args) {
            Tienda impresora = new Tienda("Impresora HP", 100, 21, 5);
            Tienda raton = new Tienda("Ratón Logitech");
            Tienda libro = new Tienda("Libro Java", 20, 4, 15);

            System.out.println(impresora);
            System.out.println(raton);
            System.out.println(libro);
            System.out.println("Número de productos: " + Tienda.getNumProductos());

            Tienda.setDescuentoGlobal(10);
            raton.setPrecio(12);

            System.out.println("\nDespués del Black Friday:");
            System.out.println(impresora);
            System.out.println(raton);
            System.out.println(libro);
            System.out.println("Número de productos: " + Tienda.getNumProductos());
        }
    }

