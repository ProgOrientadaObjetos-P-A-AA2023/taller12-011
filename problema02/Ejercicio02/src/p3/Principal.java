/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.*;
import p2.*;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        MatriculaCampamento mcamp = new MatriculaCampamento(100.2,30.2,
                90.2);
        
        MatriculaColegio mcolegio = new MatriculaColegio(150.2,140.2, 
                240.2, 300.4);
        
        MatriculaEscuela mescuela = new MatriculaEscuela(50.2, 40.2, 
                140.2, 200.4);
        
        MatriculaJardin mjardin = new MatriculaJardin(50.2, 140.2, 40);
        
        MatriculaMaternal mmaternal = new MatriculaMaternal(50.2,40.2,
                80.2);
        MatriculaMaternal mmaternal2 = new MatriculaMaternal(55.2, 35.2, 
                84.9);
        
        ArrayList<Matricula> lista = new ArrayList<>();
        lista. add(mcamp);
        lista. add(mcolegio);
        lista. add(mescuela);
        lista. add(mjardin);
        lista. add(mmaternal);
        lista. add(mmaternal2);
        
        for(Matricula m : lista){
        
            m.calcularMatricula();
        
        }
        
        TipoMatricula tipos = new TipoMatricula();
        tipos.establecerMatriculas(lista);
        tipos.calcularPromedioMatriculas();
        
        System.out.printf("Promedio de Matriculas: $%.2f\n", 
                tipos.obtenerPromedioMatriculas());
        
    }
    
}
