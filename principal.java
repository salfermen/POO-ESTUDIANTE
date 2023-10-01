import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String name = scanner.nextLine();

        Date bornDate = new Date(1990, 1, 15); // Reemplaza con la fecha de nacimiento real
        Estudiante estudiante = new Estudiante(name, bornDate, 0, 0, 0);

        System.out.println("Ingrese las notas del estudiante (sig1 sig2 sig3):");
        double sig1 = scanner.nextDouble();
        double sig2 = scanner.nextDouble();
        double sig3 = scanner.nextDouble();

       estudiante.nota (sig1, sig2, sig3);

        System.out.println("Nombre del primer estudiante: " + name);
        System.out.println("Fecha de nacimiento del primer estudiante: " +bornDate);
        System.out.println("Promedio de notas del primer estudiante: " +estudiante );

        scanner.close();
    }
}
