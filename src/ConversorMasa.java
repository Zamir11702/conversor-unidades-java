public class ConversorMasa extends ConversorBase {

    public ConversorMasa() {
        super("Unidades de Masa");
    }

    @Override
    public void mostrarMenuYConvertir() {

        System.out.println("\n--- " + nombreModulo.toUpperCase() + " ---");
        System.out.println("1. Kilogramos a Gramos");
        System.out.println("2. Kilogramos a Libras");
        System.out.println("3. Kilogramos a Onzas");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        System.out.print("Ingrese el valor en kilogramos: ");
        double valor = scanner.nextDouble();

        switch (opcion) {
            case 1 -> System.out.printf("%.2f kg = %.2f g%n", valor, valor * 1000);
            case 2 -> System.out.printf("%.2f kg = %.2f lb%n", valor, valor * 2.20462);
            case 3 -> System.out.printf("%.2f kg = %.2f oz%n", valor, valor * 35.274);
            default -> System.out.println("Opción no válida.");
        }
    }
}