/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_diegocasco_12111113;

/**
 *
 * @author dcasc
 */
public class Razas {
    private String nombre;
    private String planeta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Razas() {
    }

    public Razas(String nombre, String planeta) {
        this.nombre = nombre;
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
