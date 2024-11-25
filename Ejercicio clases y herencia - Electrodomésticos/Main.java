
public class Main {

    public static void main(String[] args) {
        Lavadora lavadoraAEG = new Lavadora(400, Color.PLATEADO, "PK", 30, 7);
        System.out.println(lavadoraAEG);
        System.out.println("Precio Final: " + lavadoraAEG.precioFinal() + " €");

        Television tvSamsung = new Television();
        System.out.println(tvSamsung);
        System.out.println("Precio Final: " + tvSamsung.precioFinal() + " €");

        tvSamsung = new Television(190, Color.NEGRO, "A+", 10, 24, true);
        System.out.println(tvSamsung);
        System.out.println("Precio Final: " + tvSamsung.precioFinal() + " €");
    }
}



