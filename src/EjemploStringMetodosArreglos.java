public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.length() = " + trabalengua.length());
        System.out.println("trabalengua = " + trabalengua.toCharArray()); //convierte en arreglo el string
        
        char[] arreglo = trabalengua.toCharArray();
        int largo = arreglo.length; // este length es un atributo no lleva corchetes
        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){
            //System.out.println("arreglo[i] = " + arreglo[i]); //println hace saltos de lineas
            System.out.print(arreglo[i]); // print no hace salto de lineas
        }
        System.out.println();
        System.out.println("trabalengua = " + trabalengua.split("a")); //genera un arreglo cortando por la a
        
        String[] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;
        for(int j = 0; j < l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\."); // hay que escaparla con \\ o [.]
        l = archivoArr.length;
        for(int j = 0; j < l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l - 1]);
    }
}
