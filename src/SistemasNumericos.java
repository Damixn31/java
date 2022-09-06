public class SistemasNumericos {
    public static void main(String[] args) {
        
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; // para los numeros binarios hay que pasarle al principio un 0b
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764; // a los numeros octal se le agrega adelante el numero 0
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4; // al principio hay que agregar 0x para que sepa que es hexadecimal.
        System.out.println("numeroHex = " + numeroHex);

    }
}
