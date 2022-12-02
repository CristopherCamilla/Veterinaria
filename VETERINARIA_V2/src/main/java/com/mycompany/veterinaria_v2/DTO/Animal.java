
package com.mycompany.veterinaria_v2.DTO;

/**
 *
 * @author Cristopher
 */
public abstract class Animal {
    
    
    public static int item=10; 
    
    private int id;
    private String Nombre;
    private int edad;
    private String Raza;
    private String Color;
    private boolean Carnivoro;

    public Animal(int id, String Nombre, int edad, String Raza, String Color, boolean Carnivoro) {
        this.id = id;
        this.Nombre = Nombre;
        this.edad =edad;
        this.Raza = Raza;
        this.Color = Color;
        this.Carnivoro = Carnivoro;
    }
    
        public Animal() {
        this.id = 0;
        this.Nombre = "";
        this.edad = 0;
        this.Raza = "";
        this.Color = "";
        this.Carnivoro = false;
        
        }      
    
 
    public int getId() {
        return id;
    }


    public void setId(int id) {
        
        this.id = item;
        item=item+10;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

        public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isCarnivoro() {
        return Carnivoro;
    }

    public void setCarnivoro(boolean Carnivoro) {
        this.Carnivoro = Carnivoro;
    }

  @Override
    public abstract String toString();
    
    
}
