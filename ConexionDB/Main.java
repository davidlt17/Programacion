import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CocheRepositorio repo = new CocheRepositorio(); 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Bienvenido al Garage");

        boolean salir = false;
        while (!salir) {
            // Muestro el menú
            System.out.println("\n¿Qué quieres hacer?");
            System.out.println("1️⃣  Ver todos los coches");
            System.out.println("2️⃣  Añadir un coche nuevo");
            System.out.println("3️⃣  Actualizar datos de un coche");
            System.out.println("4️⃣  Eliminar un coche");
            System.out.println("5️⃣  Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    // Muestro todos los coches
                    System.out.println("\n Lista de coches en tu garage:");
                    ArrayList<Coche> coches = repo.obtenerTodos();
                    if (coches.isEmpty()) {
                        System.out.println("Todavía no tienes ningún coche guardado.");
                    } else {
                        for (Coche c : coches) {
                            System.out.println("--> " + c);
                        }
                    }
                    break;

                case 2:
                    // Pido datos y añado un coche
                    System.out.println("\n Asistente para añadir coche nuevo:");
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();

                    Coche nuevoCoche = new Coche(marca, anio, color);
                    repo.insertar(nuevoCoche);
                    System.out.println("Coche añadido con éxito");
                    break;

                case 3:
                    // Actualizo un coche
                    System.out.println("\n Quieres actualizar un coche? Dame su info:");
                    System.out.print("Marca actual: ");
                    String marcaActual = scanner.nextLine();
                    System.out.print("Año actual: ");
                    int anioActual = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Color actual: ");
                    String colorActual = scanner.nextLine();

                    System.out.println("\nAhora dime los nuevos datos:");
                    System.out.print("Nueva marca: ");
                    String nuevaMarca = scanner.nextLine();
                    System.out.print("Nuevo año: ");
                    int nuevoAnio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo color: ");
                    String nuevoColor = scanner.nextLine();

                    Coche cocheActual = new Coche(marcaActual, anioActual, colorActual);
                    Coche cocheNuevo = new Coche(nuevaMarca, nuevoAnio, nuevoColor);
                    repo.actualizar(cocheActual, cocheNuevo);
                    System.out.println("Coche actualizado");
                    break;

                case 4:
                    // Elimino un coche
                    System.out.println("\n¿Quieres eliminar un coche? Escribe su info:");
                    System.out.print("Marca: ");
                    String marcaEliminar = scanner.nextLine();
                    System.out.print("Año: ");
                    int anioEliminar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Color: ");
                    String colorEliminar = scanner.nextLine();

                    Coche cocheEliminar = new Coche(marcaEliminar, anioEliminar, colorEliminar);
                    repo.eliminar(cocheEliminar);
                    System.out.println(" Coche eliminado.");
                    break;

                case 5:
                    // Salgo del programa
                    System.out.println("Has salido del Garage.");
                    salir = true;
                    break;

                default:
                    // Si la opción no es válida
                    System.out.println("Opcion no valida, prueba otra vez.");
            }
        }
        scanner.close(); 
    }
}