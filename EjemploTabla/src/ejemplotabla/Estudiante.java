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
    ArrayList <String> notas = new ArrayList<String>();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<String> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }
    
    
    
}
