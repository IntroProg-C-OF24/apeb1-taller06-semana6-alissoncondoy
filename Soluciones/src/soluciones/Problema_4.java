package soluciones;
import java.util.Scanner;
public class Problema_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingresar numero");
        num = teclado.nextInt();
        if (num == 1) {
            System.out.println("Enero");
        } else if (num == 2) {
            System.out.println("Febrero");
        } else if (num == 3) {
            System.out.println("Marzo");
        } else if (num == 4) {
            System.out.println("Abril");
        } else if (num == 5) {
            System.out.println("Mayo");
        } else if (num == 6) {
            System.out.println("Junio");
        } else if (num == 7) {
            System.out.println("Julio");
        } else if (num == 8) {
            System.out.println("Agosto");
        } else if (num == 9) {
            System.out.println("Septiembre");
        } else if (num == 10) {
            System.out.println("Octubre");
        } else if (num == 11) {
            System.out.println("Noviembre");
        } else if (num == 12) {
            System.out.println("Diciembre");
        } else if (num > 12) {
            System.out.println("No existe");
        }
    }
    
}
