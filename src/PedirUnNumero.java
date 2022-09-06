import javax.swing.*;

public class PedirUnNumero {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;  //tiene que tener un valor inicial y fuera del try
        try{    // es un controlar de error si se el usuario da un numero entero ejecuta esa accion
            numeroDecimal = Integer.parseInt(numeroStr); // la variables dentro del try van si tipo
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe Ingresar un numero entero");
            main(args);
            System.exit(0);\
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultBinario);

        int numeroBinario = 0b111110100; // para los numeros binarios hay que pasarle al principio un 0b
        System.out.println("numeroBinario = " + numeroBinario);

        String resultOctal = "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultOctal);

        int numeroOctal = 0764; // a los numeros octal se le agrega adelante el numero 0
        System.out.println("numeroOctal = " + numeroOctal);

        String resultHex = "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultHex);
        int numeroHex = 0x1f4; // al principio hay que agregar 0x para que sepa que es hexadecimal.
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultBinario;
        mensaje += resultOctal;
        mensaje += resultHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
