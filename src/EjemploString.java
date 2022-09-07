public class EjemploString {
    public static void main(String[] args) {
        // esta es String en forma literal
        String curso = "Programacion Java";
        // esta es un String en forma explicita
        String curso2 = new String("Programacion Java");
        boolean esIgual = curso == curso2; // aca compara por referencia.
        System.out.println("curso == curso2 = " + esIgual); // esto no va a dar false ya que son distintos
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual); // va dar true porque el metodo equals compara por valor.
        
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual); // es igual a curso y no a una nueva instancia
    }
}
