package com.company;

public class Triste implements EstadoTamagotchi{
    @Override
    public EstadoTamagotchi comer() {
        System.out.println("En Triste.comer() - hace 2 beep.");
        return this;
    }

    @Override
    public EstadoTamagotchi beber() {
        System.out.println("En Triste.beber() - hace 3 beep");
        return this;
    }

    @Override
    public EstadoTamagotchi mimos() {
        System.out.println("En Triste.mimos() - Pasa al estado Feliz.");
        return new Feliz();
    }
}
