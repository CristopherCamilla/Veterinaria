/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria_v2.DTO;

/**
 *
 * @author Cristopher
 */
public class Gato extends Animal{
    
       private String origen;

    public Gato(String origen, int id, String Nombre, int edad, String Raza, String Color, boolean Carnivoro) {
        super(id, Nombre, edad, Raza, Color, Carnivoro);
        this.origen = origen;
    }

    public Gato() {
        this.origen = "";
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre Mascota: ").append(super.getNombre());
        sb.append("\nEdad: ").append(super.getEdad());
        return sb.toString();
    }
    
    
}
