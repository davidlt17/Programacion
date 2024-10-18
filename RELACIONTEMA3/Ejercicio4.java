/*Ejercicio 4: Validación de una fecha
Escribe un programa que solicite al usuario una fecha (día, mes, año) y valide
si la fecha es correcta. Considera los años bisiestos y los meses que tienen diferentes números de días. Usa `switch` para verificar los meses, y `if-else`
para los años bisiestos*/

package David;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Introduce el día: ");
                int dia = scanner.nextInt();
                System.out.println("Introduce el mes: ");
                int mes = scanner.nextInt();
                System.out.println("Introduce el año: ");
                int año = scanner.nextInt();

                boolean fechaValida = false;
                int diasEnMes = 0;


                switch (mes) {
                    case 1:  // Enero
                    case 3:  // Marzo
                    case 5:  // Mayo
                    case 7:  // Julio
                    case 8:  // Agosto
                    case 10: // Octubre
                    case 12: // Diciembre
                        diasEnMes = 31;
                        break;
                    case 4:  // Abril
                    case 6:  // Junio
                    case 9:  // Septiembre
                    case 11: // Noviembre
                        diasEnMes = 30;
                        break;
                    case 2:  // Febrero

                        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                            diasEnMes = 29;
                        } else {
                            diasEnMes = 28;
                        }
                        break;
                    default:
                        fechaValida = false;
                        break;
                }


                if (dia >= 1 && dia <= diasEnMes) {
                    fechaValida = true;
                }


                if (fechaValida) {
                    System.out.println("La fecha es válida.");
                } else {
                    System.out.println("La fecha es inválida.");
                }
            }
        }



