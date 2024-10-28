import java.util.Scanner;

public class ejercicio2 {
    final static Scanner TECLADO = new Scanner(System.in);
    public static void main(String[] args) {
        int array[] = new int[5];
        int mayor = array[0]; //Asignamos el mayor en la posicion 0 ya que el mayor valor que conocemos es la primer caja que vamos a abrir

        System.out.println("Ingrese los 5 numeros: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = TECLADO.nextInt();
            if (array[i] > mayor) { //Vamos a contar los arrays  y los comparamos con mayor que por ahora el mayor es [0]
                mayor = array[i]; //Si cuando estamos contando encontramos un vector mayor que nuestro mayor temporal, se va a actualizar al valor de [i]
            }
        }

        System.out.println("Tu valor mayor de tu array es: " + mayor);
    }
}
