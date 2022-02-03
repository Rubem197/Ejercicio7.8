package principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        System.out.println("introduce x numero1 :");
        punto1.setCoordinadaX(sc.nextInt());
        System.out.println("introduce y numero1 :");
        punto1.setCoordinadaY(sc.nextInt());
        System.out.println("introduce x numero2 :");
        punto2.setCoordinadaX(sc.nextInt());
        System.out.println("introduce y numero2 :");
        punto2.setCoordinadaY(sc.nextInt());

        punto1.igual(punto2);
        System.out.println( punto1.distancia());
        System.out.println(punto1.distanciaEntre(punto2));
    }
}
