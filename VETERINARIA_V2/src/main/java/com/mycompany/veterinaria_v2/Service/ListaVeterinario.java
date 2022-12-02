/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria_v2.Service;

import com.mycompany.veterinaria_v2.DTO.Perro;
import com.mycompany.veterinaria_v2.DTO.Veterinario;
import java.util.ArrayList;

/**
 *
 * @author Cristopher
 */
public class ListaVeterinario {
    
    private ArrayList<Veterinario> lista;

    public ListaVeterinario(ArrayList<Veterinario> lista) {
        this.lista = lista;
    }
    
    public ListaVeterinario() {
        lista = new ArrayList();
    }

    public ArrayList<Veterinario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Veterinario> lista) {
        this.lista = lista;
    }
    
    
    
}
