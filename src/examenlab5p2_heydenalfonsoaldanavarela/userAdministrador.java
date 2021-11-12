/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5p2_heydenalfonsoaldanavarela;

public class userAdministrador extends userPlantilla
{
    // Constructor
    public userAdministrador(String nombre, String username, String contra, int edad)
    {
        super(nombre, username, contra, edad);
    }
    
    // Funciones get y set

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }

    public String getContra() {
        return contra;
    }

    public int getEdad() {
        return edad;
    }
    
}
