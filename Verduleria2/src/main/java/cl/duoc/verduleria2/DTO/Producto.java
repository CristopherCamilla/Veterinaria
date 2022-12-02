/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.verduleria2.DTO;

/**
 *
 * @author Cristopher
 */
public class Producto {
    
    
    private int codigo;
    private String Subcategoria;
    private String Descripcion;
    private int precio;
    private int Cantidad;
    private String Medida;

    public Producto() {
        this.codigo = 0;
        this.Subcategoria = "";
        this.Descripcion = "";
        this.precio = 0;
        this.Cantidad = 0;
        this.Medida = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo >999){
          this.codigo = codigo;  
        } 
        
    }

    public String getSubcategoria() {
        return Subcategoria;
    }

    public void setSubcategoria(String Subcategoria) {
        
   
        this.Subcategoria = Subcategoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida = Medida;
    }
    
    
    public int getTotal(){
        
        return this.Cantidad * this.precio;
    }
    
    
}

