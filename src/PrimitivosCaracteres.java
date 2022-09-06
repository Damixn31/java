public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'A'; // el char solo acepta un solo caracter
        char caracter2 = '1';
        char caracter3 = '\u0040'; // este es un caracter UNICODE cada sistema tiene el suyo este es un arroba
        char decimal = 64;  //tambien es un arroba
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("caracter2 = " + caracter2);
        System.out.println("caracter3 = " + caracter3);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = character3: " + (decimal == caracter3)); // esto me tiene que dar true porque son iguales
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter3: " + (simbolo == caracter3));

        var catacter4 = '\u0040'; //var tambien toma char
        var decimal2 = 64; //aca el decimal2 nos va a tomar como tipo int, no como char

        // Caracteres Especiales:
        // Nota tambien se pueden usar dentro de los string
        char espacio = ' ';
        char espacio2 = '\u0020';  // este es el espacio en UNICODE
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + retornoCarro + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("maximo valor de char = " + Character.MAX_VALUE);
        System.out.println("minimo valor de char = " + Character.MIN_VALUE);
    }
}
