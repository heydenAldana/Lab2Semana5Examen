// Este es GESTION PAR AADMINISTRADOR

package examenlab5p2_heydenalfonsoaldanavarela;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class g_admin 
{
    // Atributos
    private ArrayList<userAdministrador> admin;
    private ArrayList<userComprador> buyer;
    private ArrayList<userVendedor> seller;
    
    // funcion para login
    public boolean login(String username, String password)
    {
        try
        {
            for (userAdministrador a : admin) 
            {
                if(username.equals(a.getUsername()) && password.equals(a.getContra()))
                    return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA DE DATOS");
        }
        return false;
    }
    
    
    //  -------------------- Funciones ----------------------- //
    
    /* 
     * Crear usuarios segun rol
     */
    
    public void crearUsuarioAdmin(String nombre, String user, String password, int edad)
    {
        // Verifica que sea unico
        for (userAdministrador a : admin) 
        {
            if(user.equals(a.getUsername()))
                JOptionPane.showMessageDialog(null, "Este usuario ADMINISTRADOR ya existe. Intente de nuevo");
        }
        // Crea el admin
        try
        {
            admin.add(new userAdministrador(nombre, user, password, edad));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE ESCRITURA DE DATOS");
        }
    }
    
    public void crearUsuarioCompra(String nombre, String user, String password, int edad, String cuentabancaria)
    {
        // Verifica que sea unico
        for (userComprador c : buyer) 
        {
            if(user.equals(c.getUsername()) || cuentabancaria.equals(c.getCuentabancaria()))
                JOptionPane.showMessageDialog(null, "Este usuario COMPRADOR ya existe. Intente de nuevo");
        }
        // Crea el comprador
        try
        {
            buyer.add(new userComprador(nombre, user, password, edad, cuentabancaria));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE ESCRITURA DE DATOS");
        }
    }
    
    public void crearUsuarioVenta(String nombre, String user, String password, int edad, String cuentabancaria, String personajefav)
    {
        // Verifica que sea unico
        for (userVendedor v : seller) 
        {
            if(user.equals(v.getUsername()) || cuentabancaria.equals(v.getCuentabancaria()))
                JOptionPane.showMessageDialog(null, "Este usuario VENDEDOR ya existe. Intente de nuevo");
        }
        // Crea el vendedor
        try
        {
            seller.add(new userVendedor(nombre, user, password, edad, cuentabancaria, personajefav));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE ESCRITURA DE DATOS");
        }
    }
    
    
    /* 
     * Editar usuarios por datos sencillos (default
     */
    
    public void editarUsuarioAdmin(String nombre, String user, String password, int edad)
    {
        // Verifica su existencia y edita
        for (userAdministrador a : admin) 
        {
            if(user.equals(a.getUsername()))
            {
                try
                {
                    if(!nombre.equals(""))
                        a.setNombre(nombre);
                    if(!user.equals(""))
                        a.setUsername(user);
                    if(!password.equals(""))
                        a.setContra(password);
                    if(edad >= 0)
                    {
                        if(edad >= 18)
                            a.setEdad(edad);
                        else if(edad < 18)
                            JOptionPane.showMessageDialog(null, "ADVERTENCIA: Debe ser mayor de edad como mínimo. Este dato no será editado");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR DE ESCRITURA DE DATOS");
                }
            }
                
        }
    }
    
    public void editarUsuarioComprador(String nombre, String user, String password, int edad, String cuentabancaria, double saldo, double saldocompra)
    {
        // Verifica su existencia y edita
        for (userComprador c : buyer) 
        {
            if(user.equals(c.getUsername()) || cuentabancaria.equals(c.getCuentabancaria()))
            {
                try
                {
                    if(!nombre.equals(""))
                        c.setNombre(nombre);
                    if(!user.equals(""))
                        c.setUsername(user);
                    if(!password.equals(""))
                        c.setContra(password);
                    if(edad >= 0)
                    {
                        if(edad >= 18)
                            c.setEdad(edad);
                        else if(edad < 18)
                            JOptionPane.showMessageDialog(null, "ADVERTENCIA: Debe ser mayor de edad como mínimo. Este dato no será editado");
                    }
                    if(!cuentabancaria.equals(""))
                        c.setNombre(nombre);
                    c.setSaldo(c.getSaldo() + saldo);
                    c.setSaldoC(c.getSaldoC() + saldocompra);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR DE ESCRITURA DE DATOS");
                }
            }
                
        }
    }
    
    public void editarUsuarioVendedor(String nombre, String user, String password, int edad, String cuentabancaria, double saldo, String personajefav)
    {
        // Verifica su existencia y edita
        for (userVendedor v : seller) 
        {
            if(user.equals(v.getUsername()) || cuentabancaria.equals(v.getCuentabancaria()))
            {
                try
                {
                    if(!nombre.equals(""))
                        v.setNombre(nombre);
                    if(!user.equals(""))
                        v.setUsername(user);
                    if(!password.equals(""))
                        v.setContra(password);
                    if(edad >= 0)
                    {
                        if(edad >= 18)
                            v.setEdad(edad);
                        else if(edad < 18)
                            JOptionPane.showMessageDialog(null, "ADVERTENCIA: Debe ser mayor de edad como mínimo. Este dato no será editado");
                    }
                    if(!cuentabancaria.equals(""))
                        v.setNombre(nombre);
                    v.setSaldo(v.getSaldo() + saldo);
                    if(!personajefav.equals(""))
                        v.setPersonajefav(personajefav);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR DE ESCRITURA DE DATOS");
                }
            }
                
        }
    }
    
    /*
     * Eliiminar usuarios por user
    */
    
    public void eliminarUsuario(String tipo, String username)
    {
        int pos = 0;
        try
        {
            if(tipo.equalsIgnoreCase("administrador"))
            {
                for (userAdministrador a : admin) 
                {
                    if(username.equals(a.getUsername()))
                        admin.remove(pos);
                    pos++;
                }
            }
            else if(tipo.equalsIgnoreCase("comprador"))
            {
                for (userComprador c : buyer) 
                {
                    if(username.equals(c.getUsername()))
                        buyer.remove(pos);
                    pos++;
                }
            }
            else if(tipo.equalsIgnoreCase("vendedor"))
            {
                for (userVendedor v : seller) 
                {
                    if(username.equals(v.getUsername()))
                        seller.remove(pos);
                    pos++;
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "ADVERTENCIA: Este usuario " + username + "no existe en la base de datos.\n Verifique que haya escrito correctanemte el nombre de usuario.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA DE DATOS");
        }
    }
}
