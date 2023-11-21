package soluciones;
import java.util.Scanner;
public class Problema_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3, aux;
        System.out.println("Ingrese el valor del lado 1: ");
        lado1 = teclado.nextDouble();
        System.out.println("Ingrese el valor del lado 2: ");
        lado2 = teclado.nextDouble();
        System.out.println("Ingrese el valor del lado 3 ");
        lado3 = teclado.nextDouble();
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("--------------------------");
                System.out.println("El triangulo es EQUILATERO");
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                System.out.println("--------------------------");
                System.out.println("El triangulo es ISOSCELES");
            } else {
                System.out.println("--------------------------");
                System.out.println("El triangulo es ESCALENO");
            }
        } else {
            System.out.println("--------------------------");
            System.out.println("NO ES UN TRIANGULO");
        }
        teclado.close();
    }
}