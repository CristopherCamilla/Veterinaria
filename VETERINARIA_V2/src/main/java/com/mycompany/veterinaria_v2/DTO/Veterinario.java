/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria_v2.DTO;

/**
 *
 * @author Cristopher
 */
public class Veterinario {
    
    private String rut;
    private String dv;
    private String nombre;
    private String fono;
    private String dire;
    private String especie;

    public Veterinario(String rut, String dv, String nombre, String fono, String dire, String especie) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.fono = fono;
        this.dire = dire;
        this.especie = especie;
    }
    
        public Veterinario() {
        this.rut = "";
        this.dv = "";
        this.nombre = "";
        this.fono = "";
        this.dire = "";
        this.especie = "";
        
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("rut:").append(this.getRut()).append("-").append(this.getDv());
        sb.append(", Nombre: ").append(this.getNombre());
        sb.append(", Especialodad: ").append(this.getEspecie());
        return sb.toString();
    }
    
}
