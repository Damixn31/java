public class ConversionDeTipos {
    public static void main(String[] args) {
        // convertir un string a entero
        String numeroStr = "50";
        
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean realLogico = Boolean.parseBoolean(logicoStr);
        System.out.println("realLogico = " + realLogico);

        //conversion a la inversa de entero a sring.
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // otra manera de convertir entero a string
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        // otra forma
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        //conversion de primitivos a primitivos, NOTA: siempre hay que convertir los tipos de datos que soportan, para no tener perdidas de datos
        int i = 22768;
        short s = (short)i; // short soporta mucho mas que 10000 esto se llama casting forzar a que sea un tipo menor.
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        //boolean b = (boolean) i; // esto no se puede castear ya que no es compatible.
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
