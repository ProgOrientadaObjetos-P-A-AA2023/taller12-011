/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author reroes
 */
public class VentasTvs {
    double precioTotal;
    ArrayList<Televisor> televisores;
    String marcasVendidas;
    
    public void establecerTelevisores(ArrayList<Televisor> t){
        televisores = t;
    }
    
    public ArrayList<Televisor> obtenerTelevisores(){
        return televisores;
    }
    
    public void establecerPrecioTotal(){
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
            
        }
        precioTotal = s;
        
    }
    
    public double totalPrecioTvs(ArrayList<Televisor> t){
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            s = s + t.get(i).obtenerPrecio();
            
        }
        return s;
    }
    
    public double televisorMasCaro(ArrayList<Televisor> t){
        double s = 0;
        
        for (int i = 0; i < t.size() - 1; i++) {
            s = t.get(i).obtenerPrecio();
            
            if(s < t.get(i+1).obtenerPrecio() ){
            
                s = t.get(i+1).obtenerPrecio();
            }
            
        }
        
        return s;
    }
    
    public String listaMarcasVendidas(ArrayList<Televisor> t){
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        return s;
    }
    
    public double obtenerPrecioTotal(){
        return precioTotal;
    }
    
        
    public String obtenerMarcasVendidas(){
        return marcasVendidas;
    }
    
}
