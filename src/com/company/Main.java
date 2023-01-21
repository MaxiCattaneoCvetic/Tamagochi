package com.company;

public class Main {

    public static void main(String[] args) {
        // Creamos un objeto Tamagotchi
        Tamagotchi tamagotchi = new Tamagotchi();
        System.out.println("Estado inicial: "+tamagotchi.getEstado());

        //Invoco a un metodo del objeto: tamagotchi
        tamagotchi.darDecomer();
        System.out.println("Estado actual 1: "+tamagotchi.getEstado());

        //Se seteo un cambio de estado
        tamagotchi.setEstado(new Triste());
        System.out.println("Estado actual 2: "+tamagotchi.getEstado());
        tamagotchi.hacerMimos();
        System.out.println("Estado actual 3: "+tamagotchi.getEstado());

    }
}
