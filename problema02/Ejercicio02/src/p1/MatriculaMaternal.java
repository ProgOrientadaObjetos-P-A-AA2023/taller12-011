package p1;

import p2.Matricula;

public class MatriculaMaternal extends Matricula {
    
    private double costoDesayunos;
    private double costoAlmuerzo;
    private double costoMedico;
    
    public MatriculaMaternal(double cD, double cA, double cM){
        
        costoDesayunos = cD;
        costoAlmuerzo = cA;
        costoMedico = cM;
    
    }

    public void establecerCostoDesayunos(double c) {
        costoDesayunos = c;
    }

    public void establecerCostoAlmuerzo(double c) {
        costoAlmuerzo = c;
    }

    public void establecerCostoMedico(double c) {
        costoMedico = c;
    }
    
    @Override
    public void calcularMatricula(){
        matricula = costoDesayunos + costoAlmuerzo + costoMedico;
    }

    public double obtenerCostoDesayunos() {
        return costoDesayunos;
    }

    public double obtenerCostoAlmuerzo() {
        return costoAlmuerzo;
    }

    public double obtenerCostoMedico() {
        return costoMedico;
    }
    
}