package org.example;

public class Defensa extends Jugador {
    private int bloqueos;

    public Defensa(String nombre, int edad, String equipo, int bloqueos) {
        super(nombre, edad, equipo);
        this.bloqueos = bloqueos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bloqueos: " + bloqueos);
    }
}
