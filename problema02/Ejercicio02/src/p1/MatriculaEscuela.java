package p1;

import p2.Matricula;

public class MatriculaEscuela extends Matricula{
    
    private double costoLibros;
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;
    
    public MatriculaEscuela(double cL, double cD, double cF, double cU){
    
        costoLibros = cL;
        costoDeportes = cD;
        costoFolletos = cF;
        costoUniformes = cU;
    
    }

    public void establecerCostoLibros(double c) {
        costoLibros = c;
    }

    public void establecerCostoDeportes(double c) {
        costoDeportes = c;
    }

    public void establecerCostoFolletos(double c) {
        costoFolletos = c;
    }

    public void establecerCostoUniformes(double c) {
        costoUniformes = c;
    }
    
    @Override
    public void calcularMatricula(){
        matricula = costoLibros + costoDeportes + costoFolletos + 
                costoUniformes;
    }

    public double obtenerCostoLibros() {
        return costoLibros;
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
    
}
