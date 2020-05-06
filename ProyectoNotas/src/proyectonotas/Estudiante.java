/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonotas;

import java.util.ArrayList;

/**
 *
 * @author andresbaezrincon
 */
public class Estudiante {
    String nombre;
    ArrayList<String> listaNotas = new ArrayList<String>();
    
    Estudiante(String Nombre){
        this.nombre = Nombre;
    }
    Estudiante(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
