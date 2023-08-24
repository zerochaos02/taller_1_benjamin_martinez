import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static String[][] crearMatrizCartas() {
        String mazo[][] = new String[2][12];
        for (int fila=0; fila < 12;fila++){
            mazo[fila][0] = "dato 0";
            mazo[fila][1] = "dato 1";
        }
        return mazo;
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
    public static String input() {
        Scanner sn = new Scanner(System.in);
        String input = sn.next();
        return input;
    }

    public static void menu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Jugar con 2 personas");
            System.out.println("2. Salir");
            System.out.println("Escribe una de las opciones");
            String opcion = input();
            switch (opcion) {
                case "1":
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case "2":
                    salir = salir();
                    break;
                default:
                    System.out.println("Solo los números 1 o 2");
            }
        }
    }
}
