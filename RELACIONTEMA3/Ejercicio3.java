package David;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int notamates;
        int notalengua;
        int notahistoria;
        int notaquimica;
        int notaingles;
        double nota_media;
        double i = (1 / 5.0);

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica la calificación obtenida en Matemáticas.");
        notamates = sc.nextInt();
        if ((notamates > 100) || (notamates < 0)) {
            System.out.println("La nota introducida NO es correcta");
            return;
        }
        System.out.println("Indica la calificación obtenida en Lengua.");
        notalengua = sc.nextInt();
        if ((notalengua > 100) || (notalengua < 0)) {
            System.out.println("La nota introducida NO es correcta");
            return;
        }
        System.out.println("Indica la calificación obtenida en Historia.");
        notahistoria = sc.nextInt();
        if ((notahistoria > 100) || (notahistoria < 0)) {
            System.out.println("La nota introducida NO es correcta");
            return;
        }
        System.out.println("Indica la calificación obtenida en Quimica.");
        notaquimica = sc.nextInt();
        if ((notaquimica > 100) || (notaquimica < 0)) {
            System.out.println("La nota introducida NO es correcta");
            return;
        }
        System.out.println("Indica la calificación obtenida en Ingles.");
        notaingles = sc.nextInt();
        if ((notaingles > 100) || (notaingles < 0)) {
            System.out.println("La nota introducida NO es correcta");
            return;
        }

        //Calculo de la nota media

        nota_media = ((notahistoria + notamates + notaingles + notalengua + notahistoria) * (i)); //Importante poner .0 para que no se detecte como una division de enteros

        if (nota_media < 60) {
            System.out.println("Tu nota media es de " + nota_media + " (F).");

        } else if ((nota_media < 70) && (nota_media >= 60)) {
            System.out.println("Tu nota media es de " + nota_media + " (D).");

        } else if ((nota_media < 80) && (nota_media >= 70)) {
            System.out.println("Tu nota media es de " + nota_media + " (C).");

        } else if ((nota_media < 90) && (nota_media >= 80)) {
            System.out.println("Tu nota media es de " + nota_media + " (B).");

        } else if ((nota_media <= 100) && (nota_media >= 90)) {
            System.out.println("Tu nota media es de " + nota_media + " (A).");
        }


    }
}