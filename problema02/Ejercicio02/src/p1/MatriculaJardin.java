package p1;

import p2.Matricula;

public class MatriculaJardin extends Matricula {
    
    private double costoDesayunos;
    private double costoLibros;
    private double costoPaseos;
    
    public MatriculaJardin(double cD, double cL, double cP){
    
        costoDesayunos = cD;
        costoLibros = cL;
        costoPaseos = cP;
    
    }

    public void establecerCostoDesayunos(double f) {
        
        costoDesayunos = f;
        
    }

    public void establecerCostoLibros(double f) {
        
        costoLibros = f;
        
    }

    public void establecerCostoPaseos(double f) {
        
        costoPaseos = f;
        
    }
    
    @Override
    public void calcularMatricula(){
        
        matricula = costoDesayunos + costoLibros + costoPaseos;
      
    }

    public double obtenerCostoDesayunos() {
        
        return costoDesayunos;
        
    }

    public double obtenerCostoLibros() {
        
        return costoLibros;
        
    }

    public double obtenerCostoPaseos() {
        
        return costoPaseos;
        
    }
    
}
