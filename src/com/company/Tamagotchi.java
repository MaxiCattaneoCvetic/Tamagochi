package com.company;

import java.util.List;

public class Tamagotchi {
    //Atributos
    //Relación 1 a 1 con la Interface: EstadoTamagotchi
    //Esto un atributo, que es del tipo de una Inteface
    private EstadoTamagotchi estado;


    //Constructor
    public Tamagotchi() {
        //Seteo el estado INICIAL
        estado = new Hambriento();
    }

    //SETs y GETs
    public EstadoTamagotchi getEstado() {
        return estado;
    }

    public void setEstado(EstadoTamagotchi estado) {
        this.estado = estado;
    }


    //Metodos
    public void darDecomer(){
        //Actualiza el valor del atributo estado
        //de acuerdo a lo que devuelve el metodo invocado
        //Es decir, sobreescribe el estado
        this.estado = this.estado.comer();
    }

    public void darDebeber(){
        this.estado = this.estado.beber();
    }

    public void hacerMimos(){
        this.estado = this.estado.mimos();
    }

}
