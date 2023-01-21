package com.company;

public class Feliz implements EstadoTamagotchi{
    @Override
    public EstadoTamagotchi comer() {
        System.out.println("En Feliz.comer() - No hace nada.");
        return this;
    }

    @Override
    public EstadoTamagotchi beber() {
        System.out.println("En Feliz.beber() - hace 5 beep");
        return this;
    }

    @Override
    public EstadoTamagotchi mimos() {
        System.out.println("En Feliz.mimos() - no hace nada");
        return this;
    }
}
