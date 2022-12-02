/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria_v2.Service;

import com.mycompany.veterinaria_v2.DTO.Perro;
import java.util.ArrayList;

/**
 *
 * @author Cristopher
 */
public class ListaPerro {
    
     private ArrayList<Perro> listaPerro;

    public ListaPerro(ArrayList<Perro> listaPerro) {
        this.listaPerro = listaPerro;
    }
    
        public ListaPerro() {
        listaPerro = new ArrayList();
    }

    public ArrayList<Perro> getListaPerro() {
        return listaPerro;
    }

    public void setListaPerro(ArrayList<Perro> listaPerro) {
        this.listaPerro = listaPerro;
    }
    
        public void AgregarPerro(Perro perrito){
        this.listaPerro.add(perrito);
    }
    
    public void EliminarPerro(Perro perrito){
        this.listaPerro.remove(perrito);
    }
    
    public void ReemplazarPerro(int indice, Perro perrito){
        this.listaPerro.set(indice, perrito);
    }
    
    public Perro ObtenerPerro(int indice){
        return this.listaPerro.get(indice);
    }
    
     public String imprimirPerro(){
        StringBuilder sr = new StringBuilder();
        for (Perro p : listaPerro) {
            sr.append(p.toString()+ "\n");
        }
        return String.valueOf(sr);
    }
            
        
    }
    
    
    

