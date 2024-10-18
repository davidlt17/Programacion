/*: Calculadora de impuestos según ingresos
Escribe un programa que calcule los impuestos de una persona en función de
sus ingresos anuales. Usa `if-else` para determinar los tramos:
- Menos de 20,000: 5%
- Entre 20,000 y 40,000: 10%
- Entre 40,000 y 80,000: 20%
- Más de 80,000: 30%
Además, si el usuario tiene más de 3 dependientes, reducir el impuesto en un
5%.*/

package David;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {

        int num_dep;
        int ingresos;
        final double reduccion = 0.05;
        double tasaImpuesto = 0;
        double impuestoBase;
        double ingresos_final;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de dependientes: ");
        num_dep = sc.nextInt();

        System.out.println("Introduce los ingresos anuales: ");
        ingresos = sc.nextInt();

        if (ingresos < 20000) {
            tasaImpuesto = 0.05;
        } else if (ingresos >= 20000 && ingresos < 40000) {
            tasaImpuesto = 0.10;
        } else if (ingresos >= 40000 && ingresos < 80000) {
            tasaImpuesto = 0.20;
        } else {
            tasaImpuesto = 0.30;
        }


        impuestoBase = ingresos * tasaImpuesto;


        if (num_dep >= 3) {
            impuestoBase = ingresos * (tasaImpuesto - reduccion);
        }

        ingresos_final = ingresos - impuestoBase;

        
        System.out.println("El impuesto a pagar es " + impuestoBase + " €");
        System.out.println("Los ingresos tras impuestos son " + ingresos_final + " €");
    }
}
