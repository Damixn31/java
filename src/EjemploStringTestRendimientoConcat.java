public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {


        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); // el stringbuilder es mutable asi que se puede ir modificando

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 => tardo 2ms
            // c += a + b + "\n"; // 500 => tardo 20
            sb.append(a).append(b).append("\n"); // 500 => tardo 0ms con 1000 => tarda 0ms con 10000 => 2ms. es por lejos el mas rapido en cocatenar
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
