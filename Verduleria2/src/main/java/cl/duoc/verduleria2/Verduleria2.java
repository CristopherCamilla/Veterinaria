/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.verduleria2;

import cl.duoc.verduleria2.DTO.Cliente;
import cl.duoc.verduleria2.DTO.Producto;
import cl.duoc.verduleria2.DTO.Solicitud;

/**
 *
 * @author Cristopher
 */
public class Verduleria2 {

    public static void main(String[] args) {
        Producto verdura = new Producto();
        
        verdura.setCodigo(1000);
        verdura.setSubcategoria("verdura");
        verdura.setDescripcion("zanaoria");
        verdura.setPrecio(890);
        verdura.setCantidad(1000);
        verdura.setMedida("gramos");
        
        System.out.println(verdura);
        
        Producto verdura2 = new Producto();
        
        verdura2.setCodigo(1001);
        verdura2.setSubcategoria("verdura");
        verdura2.setDescripcion("papa");
        verdura2.setPrecio(500);
        verdura2.setCantidad(1000);
        verdura2.setMedida("gramos");
        
        System.out.println(verdura2);
        
        Cliente miCliente = new Cliente();
        
        miCliente.setRun(15918489);
        miCliente.setDv("7");
        miCliente.setNombre("cris camilla");
        miCliente.setEmail("micorreo@correo.cl");
        miCliente.setDireccion("lago maihue 1389");
        miCliente.setTelefono(94416450);
        
        
        System.out.println(miCliente);
        
        
        int opcion=0;

        do {
            
                    
        System.out.println("      COMPRAR");
        System.out.println("........................");
        System.out.println("1- Papas...........$500 kg.");
        System.out.println("2- Zanahorias......$500 kg.");
        System.out.println("3- salir");
        
        
            
            if (opcion==1) {
                agregarProducto(verdura.getDescripcion());
                
                
            }
            
        } while (opcion==3);
        
        
        
        
        
        
    }
}
