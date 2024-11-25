enum Color {
    BLANCO, NEGRO, PLATEADO, ROJO, AZUL, GRIS
}

public class Electrodomestico {
    private double precioBase;
    private Color color;
    private String consumoEnergetico;
    private double peso;

    // Constructor vacío
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = Color.BLANCO;
        this.consumoEnergetico = "A";
        this.peso = 10;
    }

    // Constructor con todos los atributos
    public Electrodomestico(double precioBase, Color color, String consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // Métodos get y set
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método privado para comprobar el consumo energético
    private String comprobarConsumoEnergetico(String letra) {
        return switch (letra) {
            case "A+", "A", "B", "C", "D", "E", "F" -> letra;
            default -> "A"; // Valor por defecto
        };
    }

    // Método para calcular el precio final
    public double precioFinal() {
        double precio = this.precioBase;

        // Ajuste según el consumo energético
        switch (consumoEnergetico) {
            case "A+" -> precio += 120;
            case "A" -> precio += 100;
            case "B" -> precio += 80;
            case "C" -> precio += 60;
            case "D" -> precio += 50;
            case "E" -> precio += 30;
            case "F" -> precio += 10;
        }

        // Ajuste según el peso
        if (peso <= 19) precio += 10;
        else if (peso <= 49) precio += 30;
        else if (peso <= 79) precio += 50;
        else precio += 100;

        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico: Precio Base = " + precioBase +
                ", Consumo = " + consumoEnergetico +
                ", Peso = " + peso + " kg";
    }
}
