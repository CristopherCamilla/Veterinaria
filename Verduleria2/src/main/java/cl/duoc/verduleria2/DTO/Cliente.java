/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.verduleria2.DTO;

/**
 *
 * @author Cristopher
 */
public class Cliente { private int run;
    private String dv;
    private String nombre;
    private String email;
    private String direccion;
    private int telefono;

    
    
    public Cliente() {
        this.run = 0;
        this.dv = "";
        this.nombre = "";
        this.email = "";
        this.direccion = "";
        this.telefono = 0;
    }

    
    
  
    
    
    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
     
}
