package com.company;

public class Sediento implements EstadoTamagotchi{
    @Override
    public EstadoTamagotchi comer() {
        System.out.println("En Sediento.comer() - No hace nada.");
        return this;
    }

    @Override
    public EstadoTamagotchi beber() {
        System.out.println("En Sediento.beber() - Pasa al estado Feliz.");
        return new Feliz();
    }

    @Override
    public EstadoTamagotchi mimos() {
        System.out.println("En Sediento.mimos() - no hace nada");
        return this;
    }
}
