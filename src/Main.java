import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciación de las subclases (Polimorfismo mediante la clase base)
        ConversorBase conversorLongitud = new ConversorLongitud();
        ConversorBase conversorTemperatura = new ConversorTemperatura();
        ConversorBase conversorMasa = new ConversorMasa();

        int opcion;
        do {
            System.out.println("\n===================================");
            System.out.println("    CONVERSOR MULTI-UNIDADES JAVA  ");
            System.out.println("===================================");
            System.out.println("1. " + conversorLongitud.getNombreModulo());
            System.out.println("2. " + conversorTemperatura.getNombreModulo());
            System.out.println("3. " + conversorMasa.getNombreModulo());
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción (1-4): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> conversorLongitud.mostrarMenuYConvertir();
                case 2 -> conversorTemperatura.mostrarMenuYConvertir();
                case 3 -> conversorMasa.mostrarMenuYConvertir();
                case 4 -> System.out.println("¡Gracias por utilizar el sistema!");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}