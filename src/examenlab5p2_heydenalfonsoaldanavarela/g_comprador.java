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
public class g_comprador 
{
    // Atributos
    private ArrayList<videojuego> vd;
    private ArrayList<userComprador> uc;
    private g_vendedor gv;
    private ArrayList<String> juegoscomprados;
    private double dinero = 0;
    
    // funcion para login
    public boolean login(String username, String password)
    {
        try
        {
            for (userComprador c : uc) 
            {
                if(username.equals(c.getUsername()) && password.equals(c.getContra()))
                    return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA DE DATOS");
        }
        return false;
    }
    
    // comprar un juego
    public void comprarJuego(String nombre, String destinatario) 
    {
        try
        {
            for (videojuego v : vd) 
            {
                if(nombre.equals(v.getNombre()))
                {
                    for (userComprador c : uc) 
                    {
                        if(destinatario.equals(c.getUsername()))
                        {
                            c.setVideoJuegosC(nombre);
                            if(v.getPrecio() >= c.getSaldoC())
                            {
                                // Pagar por el videojuego con saldo comprador
                                c.setSaldoC(c.getSaldoC() - v.getPrecio());
                                // Pagar a vendedor
                                darDineroAVendedor(v.getPrecio());
                            }
                            else if(v.getPrecio() < c.getSaldoC())
                                JOptionPane.showMessageDialog(null, "ADVERTENCIA: No tienes suficiente cash para comprar este juego");
                        }
                    }
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA Y/O ESCRITURA DE DATOS");
        }
    }
    
    public void pasarCash (String user, double cashbanco) 
    {
        try
        {
            for (userComprador c : uc) 
            {
                if(user.equals(c.getUsername()))
                {
                    if(c.getSaldo() >= cashbanco)
                    {
                        c.setSaldoC(c.getSaldoC() + cashbanco);
                        c.setSaldo(c.getSaldo() - cashbanco);
                    }
                    else if(c.getSaldo() <= 0 || c.getSaldo() < cashbanco)
                    {
                        JOptionPane.showMessageDialog(null, "ADVERTENCIA: Fondos insuficientes");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA Y/O ESCRITURA DE DATOS");
        }
    }
    
    // Con esto se hace la transferencia de dinero
    
    public double darDineroAVendedor(double dinero)
    {
        return dinero;
    }
}
