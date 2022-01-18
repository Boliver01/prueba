# prueba
import java.util.Scanner;

/**
 *
 * @author Borja Oliver
 */
public class SegundaLeyNewton2 {

    public static void peso() {
        Scanner tecladoMasa = new Scanner(System.in);
        Scanner tecladoPlaneta = new Scanner(System.in);
        Scanner tecladon = new Scanner(System.in);
        int m;
        char continuar = 'y';
        final double GMARTE = 3.72, GTIERRA = 9.8, GJUPITER = 24.79, GSATURNO = 10.44, GVENUS = 8.87;

        do {
            System.out.println("¿En que planeta deseas calcular el peso: 1=MARTE, 2=TIERRA, 3=JUPITER, 4=SATURNO o 5=VENUS?");
            int planeta;
            planeta = tecladoPlaneta.nextInt();
                    
            switch (planeta) {
                case 1:

                    System.out.println("Introduce la masa del astronauta en kg.");
                    m = tecladoMasa.nextInt();
                    System.out.println("El peso del Astronauta en marte es: " + m * GMARTE + " N");
                    break;
                case 2:

                    System.out.println("Introduce la masa del astronauta en kg.");
                    m = tecladoMasa.nextInt();
                    System.out.println("El peso del Astronauta en la Tierra es: " + m * GTIERRA + " N");
                    break;
                case 3:

                    System.out.println("Introduce la masa del astronauta en kg.");
                    m = tecladoMasa.nextInt();
                    System.out.println("El peso del Astronauta en Jupiter es: " + m * GJUPITER + " N");
                    break;
                case 4:

                    System.out.println("Introduce la masa del astronauta en kg.");
                    m = tecladoMasa.nextInt();
                    System.out.println("El peso del Astronauta en Saturno es: " + m * GSATURNO + " N");
                    break;
                case 5:

                    System.out.println("Introduce la masa del astronauta en kg.");
                    m = tecladoMasa.nextInt();
                    System.out.println("El peso del Astronauta en Venus es: " + m * GVENUS + " N");
                    break;

                default:
                    System.out.println("Ese planeta no esta en nuestra base de datos, disculpe las molestias.");
            }
            System.out.println("Desea continuar s/n?");
            continuar = tecladon.next().charAt(0);

        } while (continuar != 'n');

    }

}
