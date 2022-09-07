import java.util.InputMismatchException;
import java.util.Scanner;

public class PedirUnNumeroEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.in recive datos de la consola
        System.out.println("Ingrese un numero entero");

        //String numeroStr = scanner.nextLine(); // para obtener la linea del terminal que usuario ingreso de tipo string
        int numeroDecimal = 0;  //tiene que tener un valor inicial y fuera del try
        try{    // es un controlar de error si se el usuario da un numero entero ejecuta esa accion
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr); // la variables dentro del try van si tipo
        } catch(InputMismatchException e) {      // tambien se le puede poner Exception es la manera generica.
            System.out.println("Error debe Ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultOctal = "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultHex = "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultBinario;
        mensaje += resultOctal;
        mensaje += resultHex;

        System.out.println(mensaje);
    }
}
