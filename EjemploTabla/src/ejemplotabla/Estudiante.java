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
public class Estudiante {
    
    Estudiante(){}
    String nombre;
    ArrayList <Float> notas;
    Float promedio;
    String Estado;
    Estudiante(String Nombre){
        this.nombre = Nombre;
        this.notas = new ArrayList<Float>();
        this.promedio = (float)0;
        this.Estado=null;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void calculoPromedio(){
        int acumulador = 0;
        for(int i=0;i<notas.size();i++){
            acumulador+=notas.get(i);
        }
        promedio = (float)acumulador/(float)notas.size();
    }
    public void calculoEstado(){
        if (promedio>=3)
            Estado = "Aprobado";
        else
            Estado = "Reprobado";
    }
    
    
    
}
