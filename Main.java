import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void crearMatrizCartas() {

    }

    public static void agregarCartas(String nombreCarta, String puntaje) {

    }

    public static void inicializarCartasJuego() {

    }

    public static void obtenerCartas() {

    }

    public static void jugar() {

    }
    public static boolean salir() {
        return true;
    }

    public static void menu() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {
            System.out.println("1. Jugar con 2 personas");
            System.out.println("2. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    salir = salir();
                    break;
                default:
                    System.out.println("Solo los números 1 o 2");
            }
        }
    }
}