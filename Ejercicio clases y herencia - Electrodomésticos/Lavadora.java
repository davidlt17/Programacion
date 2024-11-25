public class Lavadora extends Electrodomestico {
    private double carga;

    // Constructor por defecto
    public Lavadora() {
        super();
        this.carga = 5;
    }

    // Constructor con atributos
    public Lavadora(double precioBase, Color color, String consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Método get de carga
    public double getCarga()
    {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 6) precio += 50;
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga = " + carga + " kg";
    }
}
