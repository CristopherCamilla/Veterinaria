/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.verduleria2.DTO;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Cristopher
 */
public class Solicitud {private int numero;
    private Date fecha;
    private Cliente cliente;
    private ArrayList<Producto> lista;

    public Solicitud() {
        this.numero = 0;
        this.fecha = new Date();
        this.cliente = new Cliente();;
    }

    public Solicitud(ArrayList<Producto> lista) {
        this.lista = lista;
    }

    public Solicitud(int numero, Date fecha, Cliente cliente, int total, String productos) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    ArrayList<Integer> totales = new ArrayList<>();
    
    
    
    public void agregarProducto(Producto Producto){
        lista.add(Producto);       
    }
    
    public void sumarTotal(int Total){       
        totales.add(Total);

        
    }
    
    
    
}
    
    
