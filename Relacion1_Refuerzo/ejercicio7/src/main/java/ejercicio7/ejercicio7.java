package ejercicio7;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la hora del primer instante (00~23)");
            int h1= sc.nextInt();

        System.out.println("Introduce el minuto del primer instante (00~59)");
            int m1= sc.nextInt();

        System.out.println("Introduce el segundo del primer instante (00~59)");
            int s1= sc.nextInt();

        System.out.println("Introduce la hora del segundo instante (00~23)");
            int h2= sc.nextInt();

        System.out.println("Introduce el minuto del segundo instante (00~59)");
            int m2= sc.nextInt();

        System.out.println("Introduce el segundo del segundo instante (00~59)");
            int s2= sc.nextInt();

            //Conversion a segundos

    int segundostotal1= ((h1*3600)+(m1*60)+s1);
    int segundostotal2= ((h2*3600)+(m2*60)+s2);
    int diferenciaseg= segundostotal2-segundostotal1;

            //Conversion a formato horas

        int minutosprov=diferenciaseg/60;
        int segundosfinal=diferenciaseg%60;
        int horasfinal=minutosprov/60;
        int minutosfinal=minutosprov%60;


        System.out.println("La diferencia horaria es de " +horasfinal+ " hora(s), "+minutosfinal+" minuto(s) y "+segundosfinal+" segundo(s)");




    }
}