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
    ArrayList <Float> notas = new ArrayList<Float>();

    Estudiante(String Nombre){
        this.nombre = Nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
}
