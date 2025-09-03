import java.util.Scanner;

public class Distribuidora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos nombre y edad (requisito)
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        // Pedimos valor de compra y kilómetros
        System.out.print("Ingrese el valor de la compra (ej: 35000): ");
        int valorCompra = sc.nextInt();

        System.out.print("Ingrese la distancia en kilometros: ");
        int kilometros = sc.nextInt();

        // Mostramos los datos ingresados con el formato solicitado
        System.out.println("La edad que ha ingresado es: " + edad);
        System.out.println("El nombre que ha ingresado es: " + nombre);
        System.out.println("el valor de compra que ha ingresado es: " + valorCompra);
        System.out.println("la distancia en kilometros es: " + kilometros);

        // Cálculo del costo de despacho según reglas de negocio (con un supuesto claro)
        int costoDespacho;
        if (valorCompra > 50000) {
            if (kilometros <= 20) {
                costoDespacho = 0; // servicio gratuito dentro de 20 km
            } else {
                // Supuesto: si supera 50k pero queda fuera de 20 km, aplicamos tarifa 150/km.
                costoDespacho = 150 * kilometros;
            }
        } else if (valorCompra >= 25000) {
            costoDespacho = 150 * kilometros;
        } else {
            costoDespacho = 300 * kilometros;
        }

        System.out.println("Costo de despacho: $" + costoDespacho + " pesos");

        sc.close();
    }
}
