/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5p2_heydenalfonsoaldanavarela;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author heyde
 */
public class g_vendedor 
{
    // Atributos
    private ArrayList<userVendedor> seller;
    private ArrayList<videojuego> vd;
    private ArrayList<String> juegosvendidos;
    private double rating = 0;
    
    // ------------------------ Funciones ----------------------- //
    
    // Crear un juego
    public void crearJuego(String nombre, int aniocreacion, int cantidad, double precio)
    {
        for (videojuego v : vd) 
        {
            if(nombre.equals(v.getNombre()))
            {
                JOptionPane.showMessageDialog(null, "ADVERTENCIA: Este videojuego ya existe.");
                return;
            }
        }
        try
        {
            vd.add(new videojuego(nombre, aniocreacion, cantidad, precio));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE ESCRITURA DE DATOS");
        }
    }
    
    
    // Editar el precio de un juego
    public void editarPrecioJuego(String nombrejuego, double nuevoprecio)
    {
        try
        {
            for (videojuego v : vd) 
            {
                if(nombrejuego.equals(v.getNombre()))
                    v.setPrecio(nuevoprecio);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA Y/O ESCRITURA DE DATOS");
        }
    }
    
    // Eliminar un juego
    public void eliminarJuego(String nombre)
    {
        int pos = 0;
        boolean borrado = false;
        try
        {
            for (videojuego v : vd) 
            {
                if(nombre.equals(v.getNombre()))
                {
                    vd.remove(pos);
                    borrado = true;
                }
                pos++;
            }
            if(!borrado)
                JOptionPane.showMessageDialog(null, "ADVERTENCIA: Este videojuego no fue orrado. ¿Escribió bien el nombre?");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA Y/O ESCRITURA DE DATOS");
        }
    }
    
    // Acumula en una llista de array los juegos vendidos
    private void addsoldgame(String nombre)
    {
        juegosvendidos.add(nombre);
    }
    
    // Retorna la lista de juegos vendidos
    public String juegosVendidos()
    {
        String msg = "";
        try
        {
            msg = "Juegos vendidos: \n ---------------\n";
            for (String j : juegosvendidos) 
            {
                msg += " - " + j.toString() + ".\n";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA DE DATOS");
        }
        return msg;
    }
    
    // Funcion para puntuar vendedor
    public void actualizarRating(String nombre, double calificacion)
    {
        try
        {
            for (userVendedor v : seller) 
            {
                if(nombre.equals(v.getNombre()))
                {
                    rating += calificacion / 5;
                    v.setEstrellas(rating);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA Y/O ESCRITURA DE DATOS");
        }
    }
    // Vender un juego a comprador (va conectado a comprador)
}
