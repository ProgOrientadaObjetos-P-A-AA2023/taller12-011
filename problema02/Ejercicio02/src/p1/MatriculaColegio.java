package p1;

import p2.Matricula;


public class MatriculaColegio extends Matricula {
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;
    private double costoLaboratorios;
    
    public MatriculaColegio(double cD, double cF, double cU, double cL){
        
        costoDeportes = cD;
        costoFolletos = cF;
        costoUniformes = cU;
        costoLaboratorios = cL;
    
    }
    
    @Override
    public void calcularMatricula(){
        matricula = costoDeportes + costoFolletos + 
                costoUniformes + costoLaboratorios;
    }

    
    public double obtenerCostoDeportes() {
        return costoDeportes;
    }
    
    public double obtenerCostoFolletos() {
        return costoFolletos;
    }
    
    public double obtenerCostoUniformes() {
        return costoUniformes;
    }
    
    public double obtenerCostoLabotatorios() {
        return costoLaboratorios;
    }
    
    public void establecerCostoDeportes(double x) {
        costoDeportes = x;
    }
    
    public void establecerCostoFolletos(double x) {
        costoFolletos = x;
    }
    
    public void establecerCostoUniformes(double x) {
        costoUniformes = x;
    }
    
    public void establecerCostoLabotatorios(double x) {
        costoLaboratorios = x;
    }
    
    
}
