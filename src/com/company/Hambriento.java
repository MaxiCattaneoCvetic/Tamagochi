package com.company;

public class Hambriento implements EstadoTamagotchi{
    @Override
    public EstadoTamagotchi comer() {
        System.out.println("En Hambriento.comer() - Pasa al estado Feliz.");
        return new Feliz();
    }

    @Override
    public EstadoTamagotchi beber() {
        System.out.println("En Hambriento.beber() - no hace nada");
        return this;
    }

    @Override
    public EstadoTamagotchi mimos() {
        System.out.println("En Hambriento.mimos() - no hace nada");
        return this;
    }
}
