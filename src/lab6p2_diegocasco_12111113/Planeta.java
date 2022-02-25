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
public class Planeta {
    private String nombre;
    private int temperatura;
    private int tamano;
    private String agua;

    public Planeta() {
    }

    public Planeta(String nombre, int temperatura, int tamano, String agua) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.tamano = tamano;
        this.agua = agua;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    @Override
    public String toString() {
        return "Planeta{" + "nombre=" + nombre + '}';
    }
    
}
