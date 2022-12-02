/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria_v2.Service;

import com.mycompany.veterinaria_v2.DTO.Gato;
import java.util.ArrayList;

/**
 *
 * @author Cristopher
 */
public class ListaGato {
    
         private ArrayList<Gato> listagato;

    public ListaGato(ArrayList<Gato> listagato) {
        this.listagato = listagato;
    }
    
        public ListaGato() {
        listagato = new ArrayList();
    }

    public ArrayList<Gato> getListaGato() {
        return listagato;
    }

    public void setListaGato(ArrayList<Gato> listagato) {
        this.listagato = listagato;
    }
    
        public void AgregarGato(Gato gatito){
        this.listagato.add(gatito);
    }
    
    public void EliminarGato(Gato gatito){
        this.listagato.remove(gatito);
    }
    
    public void ReemplazarGato(int indice, Gato gatito){
        this.listagato.set(indice, gatito);
    }
    
    public Gato ObtenerGato(int indice){
        return this.listagato.get(indice);
    }
    
    
}
