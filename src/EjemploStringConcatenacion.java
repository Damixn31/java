public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String nombre = "Damian Olmedo";

        String detalle = curso + " con el alumno " + nombre;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB)); // usar parentesis cuando concatenamos con enteros

        System.out.println(numeroA + numeroB + detalle);
        
        String detalle2 = curso.concat(" ".concat(nombre));
        System.out.println("detalle2 = " + detalle2);

    }
}
