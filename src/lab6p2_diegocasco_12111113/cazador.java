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
public class cazador {
    private String nombre;
    private String raza;
    private int edad;
    private String amenaza;
    private int humanosatrapados;
    
    public cazador() {
    }

    public cazador(String nombre, String raza, int edad, String amenaza, int humanosatrapados) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.amenaza = amenaza;
        this.humanosatrapados = humanosatrapados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAmenaza() {
        return amenaza;
    }

    public void setAmenaza(String amenaza) {
        this.amenaza = amenaza;
    }

    public int getHumanosatrapados() {
        return humanosatrapados;
    }

    public void setHumanosatrapados(int humanosatrapados) {
        this.humanosatrapados = humanosatrapados;
    }
    
}
