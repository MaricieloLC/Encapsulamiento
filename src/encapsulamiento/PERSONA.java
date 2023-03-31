/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author Lozano Coila, Maricielo
 */
public class PERSONA {
    
    private String nombre;
    private String dni;
    private double peso;
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String Nombre){
        this.nombre = nombre;
    }

    public PERSONA(String nombre, String dni, double peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.peso = peso;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    

    
}
