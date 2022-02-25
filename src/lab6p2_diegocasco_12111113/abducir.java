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
public class abducir {
    private String nombre;
    private int edad;
    private int animalesatrapados;
    private String raza;
    public abducir() {
    }

    public abducir(String nombre, int edad, int animalesatrapados, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.animalesatrapados = animalesatrapados;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnimalesatrapados() {
        return animalesatrapados;
    }

    public void setAnimalesatrapados(int animalesatrapados) {
        this.animalesatrapados = animalesatrapados;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
}
