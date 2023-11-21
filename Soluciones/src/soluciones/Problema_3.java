package soluciones;
import java.util.Scanner;
public class Problema_3 {
    public static void main(String[] args) {
        double peso, costoEnvio;
        String region, local, nacional;
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = tecla.nextDouble();
        System.out.print("Ingrese la region (local/nacional): ");
        region = tecla.next();
        costoEnvio = 0;
        if (peso < 5 && region.equalsIgnoreCase("local")) {
            costoEnvio = 5;
        } else if (peso >= 5 && peso <= 10 && region.equalsIgnoreCase("nacional")) {
            costoEnvio = 10;
        } else {
            costoEnvio = 15;
        }
        System.out.println("----------------------------------");
        System.out.println("El costo de envio es: $" + costoEnvio);
        tecla.close();
    }
}
