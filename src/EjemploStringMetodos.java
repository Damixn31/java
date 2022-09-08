import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Damian";

        System.out.println("nombre.length() = " + nombre.length()); // para saber el largo de la cadena
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // para convertir en mayusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // para convertir en minusculas
        System.out.println("nombre.equals(\"Damian\") = " + nombre.equals("Damian")); //comparar a nivel de valor
        System.out.println("nombre.equals(\"Damian\") = " + nombre.equals("damian")); // da false porque esta en minuscula
        System.out.println("nombre.equalsIgnoreCase() = " + nombre.equalsIgnoreCase("damian")); //ignora las mayusculas y minusculas
        System.out.println("nombre.compareTo(\"Damian\") = " + nombre.compareTo("Damian"));
        System.out.println("nombre.compareTo(\"Ezequiel\") = " + nombre.compareTo("Ezequiel"));
        System.out.println("nombre.charAt() = " + nombre.charAt(0)); //camptura el valor recive un entero
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length())-1 = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // desde el index hasta lo que sigue
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // desde hasta
        System.out.println("nombre.substring(5) = " + nombre.substring(5));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \".\") = " + trabalengua.replace("a", ".")); // primer valor que quiero remplazar el segundo el por cual lo quiero remplazar

        // si imprimimos trabalenguas va a ser el mismo porque no cambia, con el metodo creamos una nueva instancia pero la original queda como esta.
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf() = " + trabalengua.indexOf('a')); // permite saber si se encuentra algun caracter dentro del string y devuelve la primera posicion
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a')); // tambien la ultima ocurrrencia
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf('z')); // si el caracter no existe dentro nos va retornar -1 
        System.out.println("trabalengua.contains('t') = " + trabalengua.contains("t")); //aca siempre tenemos que pasarle un string osea comillas dobles esto nos retrona true o false segun si existe o no el caracter buscado
        System.out.println("trabalengua.startsWith(\"lenguas\") = " + trabalengua.startsWith("lenguas")); // si comienza con tal palabras retorna tambien true o false
        System.out.println("trabalengua.endsWith() = " + trabalengua.endsWith("traba")); // si termina con lo mismo true o false retorna
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim()); //quita los espacios en blanco en ambos lados.
    }
}
