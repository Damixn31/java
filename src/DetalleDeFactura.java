import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de la factura:");

        String nombre = scanner.nextLine();

        System.out.println("Ingrese precio de primer producto:");
        double precioProducto1 = scanner.nextDouble();

        System.out.println("Ingrese precio de segundo producto:");
        double precioProducto2 = scanner.nextDouble();


        double totalBruto = (precioProducto1 + precioProducto2);
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String mensaje = "La factura " + nombre + " tiene un total bruto de " + totalBruto + ", con un impuesto de " + impuesto + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(mensaje);
    }
}
