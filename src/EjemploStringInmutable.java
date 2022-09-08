public class EjemploStringInmutable {
    public static void main(String[] args) {

        //para que el resultado mute hay que guardarla en una nueva variable.

        String curso = "Programacion Java"; //curso se mantiene inmutable
        String nombre = "Damian Olmedo";

        String resultado = curso.concat("".concat(nombre));
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + " con " + nombre;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
