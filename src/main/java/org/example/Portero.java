package org.example;

public class Portero extends Jugador {
    private int atajadas;
    private int golesRecibidos;
    private int camiseta;

    public Portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos, int camiseta) {
        super(nombre, edad, equipo);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
        this.camiseta = camiseta;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Atajadas: " + atajadas);
        System.out.println("Goles Recibidos: " + golesRecibidos);
        System.out.println("Camiseta: " + camiseta);
    }
}
