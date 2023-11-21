package soluciones;
import java.util.Scanner;
public class Problema_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingrese numero");
        num = teclado.nextInt();
        if (num == 1) {
            System.out.println("Suma");
        } else if (num == 2) {
            System.out.println("Resta");
        } else if (num == 3) {
            System.out.println("Multiplicacion");
        } else if (num == 4) {
            System.out.println("Division");
        }
    } 
}
