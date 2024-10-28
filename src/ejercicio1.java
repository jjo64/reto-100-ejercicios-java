import java.util.Scanner;

public class ejercicio1 {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        Tienda();
    }
    public static void Tienda() {
        double ventas[] = new double[5];
        int total = 0;
        System.out.println("Ingrese las 30 ventas del mes: ");

        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + (i + 1));
            ventas[i] = TECLADO.nextDouble();
        }

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > 2000) {
                System.out.println("Nuestra venta " + (i+1) + " fue mayor a 2000 euros");
                total++;
            }
        }

        System.out.println("El total de ventas mayores a 2000 es: " + total);
    }
}
