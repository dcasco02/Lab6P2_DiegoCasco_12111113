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
public class Explorador {
    private String nombre;
    private int edad;
    private String planetafav;
    private String raza;
    private String amenaza;
    public Explorador() {
    }

    public Explorador(String nombre, int edad, String planetafav, String raza, String amenaza) {
        this.nombre = nombre;
        this.edad = edad;
        this.planetafav = planetafav;
        this.raza = raza;
        this.amenaza = amenaza;
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

    public String getPlanetafav() {
        return planetafav;
    }

    public void setPlanetafav(String planetafav) {
        this.planetafav = planetafav;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAmenaza() {
        return amenaza;
    }

    public void setAmenaza(String amenaza) {
        this.amenaza = amenaza;
    }
    
}
