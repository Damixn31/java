public class EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;
        
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = " ";//"Progamacion Java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); // este metodo evalua si el largo es == 0
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // para validar si hay un espacio vacio
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso)); // el metodo concat solo la vamos a usar cuando tenemos una instacia y no tiene valor null
        }
    }
}
