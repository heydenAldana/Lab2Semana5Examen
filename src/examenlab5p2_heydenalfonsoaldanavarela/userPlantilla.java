/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5p2_heydenalfonsoaldanavarela;

/**
 *
 * @author heyde
 */
public class userPlantilla 
{
    // Atributos
    public String nombre, username, contra;
    public int edad;
    
    // Constructor
    public userPlantilla (String nombre, String username, String contra, int edad)
    {
        this.nombre = nombre;
        this.username = username;
        this.contra = contra;
        this.edad = edad;
    }
    
    // Funciones get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
