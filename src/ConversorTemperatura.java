public class ConversorTemperatura extends ConversorBase {

    public ConversorTemperatura() {
        super("Unidades de Temperatura");
    }

    @Override
    public void mostrarMenuYConvertir() {

        System.out.println("\n--- " + nombreModulo.toUpperCase() + " ---");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("3. Fahrenheit a Celsius");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        System.out.print("Ingrese el valor de temperatura: ");
        double valor = scanner.nextDouble();

        switch (opcion) {
            case 1 -> System.out.printf("%.2f °C = %.2f °F%n",
                    valor, (valor * 9 / 5) + 32);

            case 2 -> System.out.printf("%.2f °C = %.2f K%n",
                    valor, valor + 273.15);

            case 3 -> System.out.printf("%.2f °F = %.2f °C%n",
                    valor, (valor - 32) * 5 / 9);

            default -> System.out.println("Opción no válida.");
        }
    }
}
