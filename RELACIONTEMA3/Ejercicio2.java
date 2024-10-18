package David;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        final String regular = "regular";
        final String premium = "premium";
        final String vip = "vip";
        String tipo_cliente;

        final double desc_regular = 0.05;
        final double desc_premium = 0.1;
        final double desc_vip = 0.2;
        double precio;
        double preciofinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido, indique el precio del producto que va a comprar.");
        precio = sc.nextDouble();

        System.out.println("Ahora indique si es cliente regular, premium o vip.");
        sc.nextLine();
        tipo_cliente = sc.nextLine();
        if ((precio > 500) && ((tipo_cliente.toLowerCase()).equals(vip))) {
            preciofinal = precio - (precio * (desc_vip + desc_regular));

            System.out.println("Se ha aplicado un descuento por cliente VIP y por producto de +500€, el precio final es de " + preciofinal + "€.");

        } else if ((tipo_cliente.toLowerCase()).equals(vip)) {
            preciofinal = precio - (precio * (desc_vip));

            System.out.println("Se ha aplicado un descuento por cliente vip, el precio final es de " + preciofinal + "€.");

        } else if ((tipo_cliente.toLowerCase()).equals(premium)) {
            preciofinal = precio - (precio * (desc_premium));

            System.out.println("Se ha aplicado un descuento por cliente premium, el precio final es de " + preciofinal + "€.");

        } else if ((tipo_cliente.toLowerCase()).equals(regular)) {
            preciofinal = precio - (precio * (desc_regular));

            System.out.println("Se ha aplicado un descuento por cliente regular, el precio final es de " + preciofinal + "€.");


        }

    }
}
