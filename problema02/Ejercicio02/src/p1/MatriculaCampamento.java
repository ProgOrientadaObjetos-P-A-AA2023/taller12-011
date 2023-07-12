package p1;

import p2.Matricula;


public class MatriculaCampamento extends Matricula {
    private double costoTransporte;
    private double costoComida;
    private double costoInstructores;
    
    public MatriculaCampamento(double cT, double cC, double cI){
        
        costoTransporte = cT;
        costoComida = cC;
        costoInstructores = cI;
    
    }
    
    @Override
    public void calcularMatricula(){
        matricula = costoTransporte + costoComida + 
                costoInstructores;
        
    }
    
    
    public double obtenerCostoTransporte() {
        return costoTransporte;
    }
    
    public double obtenerCostoComida() {
        return costoComida;
    }
    
    public double obtenerCostoInstructores() {
        return costoInstructores;
    }
    
    public void establecerCostoTransporte(double x) {
        costoTransporte = x;
    }
    
    public void establecerCostoComida(double x) {
        costoComida = x;
    }
    
    public void establecerCostoInstructores(double x) {
        costoInstructores = x;
    }
        
    
}
