public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 1.0f;   // para decirle que es un float le tenemos que pasar al final la f sino va a ser double
        float realFloat2 = 2.12e3f; //2120f es lo mismo el punto se va corriendo hacia la derecha
        float realFloat3 = 1.5e4f; //150000f; se corre 4 veces a la derecha el punto
        float realFloat4 = 1.5e-10f; // el punto se corre hacia la izquierda va a dar 0.00000000015f
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("realFloat3 = " + realFloat3);
        System.out.println("realFloat4 = " + realFloat4);

        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308;  // cuando se le pone el punto lo acepta como double, y no lleva d al final
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("minimo valor para double = " + Double.MIN_VALUE);

        var varFlotante = 3.1416f; // por defecto es tipo double si quiero que sea flotante le paso f al final
        System.out.println("varFlotante = " + varFlotante);

    }
}
