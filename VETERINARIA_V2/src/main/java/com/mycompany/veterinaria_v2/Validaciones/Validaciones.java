/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria_v2.Validaciones;

/**
 *
 * @author Cristopher
 */
public class Validaciones {
    
    
    public static boolean validarNombre(String nombre){
        return (!nombre.isEmpty()&& nombre.length()>2);

    }
    
    public static boolean validarEdad(int edad){        
        return (edad>0 && edad<100);
    }
    
 
    
    public static boolean validarRut(int rut, char dv) {
    boolean validacion = false;
    try {
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10) {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv == (char) (s != 0 ? s + 47 : 75)) {
            validacion = true;
        }
    } catch (java.lang.NumberFormatException e) {
    } catch (Exception e) {
    }
        return validacion;
    }
    
    public static boolean validaRut2(String rut){
        if (!rut.contains("-") && rut.length() == 8){
         return true;
        }else{
         return false;
        }       
    }
    
    
    public static boolean validaDv(String dv){
        if (!dv.isEmpty() && dv=="0" || dv=="1" ||dv=="2" || dv=="3" || dv=="4" || dv=="5"||dv=="6"||dv=="7"||dv=="8"||dv=="9"||dv=="k"||dv=="K") {
            return true;
        }
          return false;
    }
    
    
}
