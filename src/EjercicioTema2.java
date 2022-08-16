package EjercicioTema2;
import java.util.Scanner;
public class EjercicioTema2 {
    public static void main(String[] args) {

        // Opcion 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un monto: ");
        int monto = scanner.nextInt();
        double iva = monto * 0.21;
        double sumaConIva = monto + iva;
        System.out.println("Total con IVA: " + sumaConIva);

        // Opcion 2
        iva(100);
    }

    static void iva(double monto){
        double iva = monto *0.21;
        double total = monto + iva;
        System.out.println(total);
    }
}
