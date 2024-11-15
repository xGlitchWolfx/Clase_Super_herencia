package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del portero:");
        String nombrePortero = scanner.nextLine();
        System.out.println("Ingrese la edad del portero:");
        int edadPortero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el equipo del portero:");
        String equipoPortero = scanner.nextLine();
        System.out.println("Ingrese la cantidad de atajadas del portero:");
        int atajadas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de goles recibidos del portero:");
        int golesRecibidos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el numero de camiseta del portero:");
        int camiseta = scanner.nextInt();

        Jugador portero = new Portero(nombrePortero, edadPortero, equipoPortero, atajadas, golesRecibidos, camiseta);

        System.out.println("Ingrese el nombre del defensa:");
        String nombreDefensa = scanner.nextLine();
        System.out.println("Ingrese la edad del defensa:");
        int edadDefensa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el equipo del defensa:");
        String equipoDefensa = scanner.nextLine();
        System.out.println("Ingrese la cantidad de bloqueos del defensa:");
        int bloqueos = scanner.nextInt();
        scanner.nextLine();

        Jugador defensa = new Defensa(nombreDefensa, edadDefensa, equipoDefensa, bloqueos);

        System.out.println("Ingrese el nombre del delantero:");
        String nombreDelantero = scanner.nextLine();
        System.out.println("Ingrese la edad del delantero:");
        int edadDelantero = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el equipo del delantero:");
        String equipoDelantero = scanner.nextLine();

        Jugador delantero = new Delantero(nombreDelantero, edadDelantero, equipoDelantero);

        portero.mostrarInfo();
        System.out.println();
        defensa.mostrarInfo();
        System.out.println();
        delantero.mostrarInfo();

        scanner.close();
    }
}