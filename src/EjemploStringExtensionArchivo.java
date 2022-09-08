public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        // esto viene bien cuando queremos saber que tipo de extension tiene
        String archivo = "alguna.imagen.pdf";
        //int i = archivo.indexOf("."); // esto aveces puesde ser un problema tanto que puede tener dos puntos entonces vendria mejor usar lastIndexOf();
        int i = archivo.lastIndexOf("."); // la ultima ocurrencia del archivo
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
    }
}
