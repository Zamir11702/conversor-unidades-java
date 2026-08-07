import java.util.Scanner;

/**
 * Clase base abstracta que define la estructura general de los conversores.
 */
public abstract class ConversorBase {
    protected String nombreModulo;
    protected Scanner scanner;

    public ConversorBase(String nombreModulo) {
        this.nombreModulo = nombreModulo;
        this.scanner = new Scanner(System.in);
    }

    // Método abstracto que cada clase hija DEBE implementar
    public abstract void mostrarMenuYConvertir();

    public String getNombreModulo() {
        return nombreModulo;
    }
}