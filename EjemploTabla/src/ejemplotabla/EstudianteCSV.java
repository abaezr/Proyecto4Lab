/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotabla;

import java.util.ArrayList;

/**
 *
 * @author andresbaezrincon
 */
public class EstudianteCSV {
    String Nombre;
    ArrayList<Float> listadoNotas;
    String Estado;
    Float promedio;
    EstudianteCSV(String nombre){
        this.Nombre = nombre;
        this.listadoNotas = new ArrayList<Float>();
        this.Estado = null;
        this.promedio = (float)0;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public void calculoPromedio(){
        int acumulador = 0;
        for(int i=0;i<listadoNotas.size();i++){
            acumulador+=listadoNotas.get(i);
        }
        promedio = (float)acumulador/(float)listadoNotas.size();
    }
    public void calculoEstado(){
        if (promedio>=3)
            Estado = "Aprobado";
        else
            Estado = "Reprobado";
    }
    
}
