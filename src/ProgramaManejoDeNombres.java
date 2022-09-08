import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de familiar:");

        String nombrePrimer = scanner.nextLine();
        String nombrePrimerOne = nombrePrimer.toUpperCase().charAt(1) + "." + nombrePrimer.substring(nombrePrimer.length()-2);

        String nombreSegun = scanner.nextLine();
        String nombreSegunTwo = nombreSegun.toUpperCase().charAt(1) + "." + nombreSegun.substring(nombreSegun.length()-2);

        String nombreTres = scanner.nextLine();
        String nombreTresThree = nombreTres.toUpperCase().charAt(1) + "." + nombreTres.substring(nombreTres.length()-2);

        System.out.println(nombrePrimerOne + "_" + nombreSegunTwo + "_" + nombreTresThree);
    }
}
