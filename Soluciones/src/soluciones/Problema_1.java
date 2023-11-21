package soluciones;
import java.util.Scanner;
public class Problema_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         Scanner tecla = new Scanner(System.in);
        int cantidadIpad, cantidadIphone, precioIpad, precioIphone, envio;
        double subtotal, iva, subtotalIva, descuento, total, montoFactura;
        System.out.println("Ingrese la cantidad de Ipad que va a adquirir: ");
        cantidadIpad = tecla.nextInt();
        System.out.println("Ingrese el precio de Ipad a adquirir:");
        precioIpad = tecla.nextInt();
        System.out.println("Ingrese la cantidad de Iphone que va a adquirir: ");
        cantidadIphone = tecla.nextInt();
        System.out.println("Ingrese el precio del Iphone a adquirir:");
        precioIphone = tecla.nextInt();
        System.out.println("Ingrese el gasto de envio: ");
        envio = tecla.nextInt();
        int totalPrecioIpad = cantidadIpad * precioIpad;
        int totalPrecioIphone = cantidadIphone * precioIphone;
        subtotal = totalPrecioIpad + totalPrecioIphone;
        iva = subtotal * 0.12;
        subtotalIva = subtotal + iva;
        if (subtotalIva > 1000) {
            descuento = subtotalIva * 0.2;
        } else {
            descuento = subtotalIva * 0.05;
        }
        if (subtotalIva > 5000) {
            envio = 0; 
        }
        total = subtotalIva - descuento + envio;
        montoFactura = subtotalIva - descuento + envio;
        System.out.println("-----------------------------------------");
        System.out.println("El precio total del Ipad es: " + totalPrecioIpad);
        System.out.println("El precio total del Iphone es: " + totalPrecioIphone);
        System.out.println("El Subtotal es de: " + subtotal);
        System.out.println("El IVA tiene un total de: " + iva);
        System.out.println("El SubTotal + IVA es: " + subtotalIva);
        System.out.println("El total con descuento es de: " + descuento);
        System.out.println("Gastos de envio es de: " + envio);
        System.out.println("EL MONTO FACTURA ES DE: " + montoFactura);
        tecla.close();
    }
}
