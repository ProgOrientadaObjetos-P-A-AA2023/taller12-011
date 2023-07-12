package p2;

import java.util.ArrayList;

public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerMatriculas(ArrayList<Matricula> l) {

        matriculas = l;

    }

    public void calcularPromedioMatriculas() {
        
        double suma = 0;
        
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            
            suma = suma + obtenerMatriculas().get(i).obtenerMatricula();
            
        }
        
        promedioMatriculas = suma / obtenerMatriculas().size();

    }

    public double obtenerPromedioMatriculas() {

        return promedioMatriculas;

    }

    public ArrayList<Matricula> obtenerMatriculas() {

        return matriculas;

    }

}
