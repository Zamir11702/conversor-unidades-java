public class ConversorLongitud extends ConversorBase {
    public ConversorLongitud() {
        super("Unidades de Longitud");
    }

    @Override
    public void mostrarMenuYConvertir() {
        System.out.println("\n--- " + nombreModulo.toUpperCase() + " ---");
        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Metros a Millas");
        System.out.println("3. Metros a Pies");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el valor en metros: ");
        double valor = scanner.nextDouble();

        switch (opcion) {
            case 1 -> System.out.printf("%.2f m = %.4f km%n", valor, valor / 1000.0);
            case 2 -> System.out.printf("%.2f m = %.4f mi%n", valor, valor * 0.000621371);
            case 3 -> System.out.printf("%.2f m = %.2f ft%n", valor, valor * 3.28084);
            default -> System.out.println("Opción no válida.");
        }
    }

}
