/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5p2_heydenalfonsoaldanavarela;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author heyde
 */
public class userVendedor extends userPlantilla
{
    // Atributos
    private double estrellas;
    private ArrayList<String> videojuegosV;
    private double saldo;
    private String cuentabancaria, personajefav;
    private Random rand = new Random();
    
    // Constructor
    public userVendedor(String nombre, String username, String contra, int edad, String cuentabancaria, String personajefav)
    {
        super(nombre, username, contra, edad);
        videojuegosV = new ArrayList<String>();
        this.cuentabancaria = cuentabancaria;
        this.estrellas = 0;
        this.saldo = saldoInicial();
    }
    
    // Funcion personal para dar saldo a VENDEDOR
    private double saldoInicial() // Dinero a cuenta bancaria
    {
        try
        {
            int saldo = rand.nextInt() + 100; 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ADVERTENCIA: Su saldo no pudo ser acreditado a su cuenta.");
            saldo = 0;
        }
        return saldo;
    }
    
    // Funciones get y set

    /*
     * Esta funcion devuelve el nombre del videojuego
     * Es una funcion RECURSIVA 
    */
    public String getVideojuegosC(String nombrevideojuego) {
        // posicion del elemento inicial
        int pos = 0;
        try
        {
            // Busca una coincidencia en el arreglo y lo devuelve
            if(videojuegosV.get(pos).equals(nombrevideojuego))
                return videojuegosV.get(pos);
            // si no lo halla, aumenta el contador
            pos++;
        } catch (Exception e) {
            // Esto es para decirle que no se encontro el juego
            JOptionPane.showMessageDialog(null, "AVISO: Este juego al parecer no está en tu lista.\n"
                    + "¿Escribió bien el nombre tal y como es el juego?");
        }
        // FUncion recursiva (dame pts extra wey:( )
        return getVideojuegosC(nombrevideojuego);
    }
    
    
    public void setVideojuegosV(String nombre)
    {
        try
        {
            videojuegosV.add(nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE LECTURA Y/O ESCRITURA DE DATOS");
        }
    }
    // Funciones get y set

    
    public double getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(double estrellas) {
        this.estrellas = estrellas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCuentabancaria() {
        return cuentabancaria;
    }

    public void setCuentabancaria(String cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
    }

    public String getPersonajefav() {
        return personajefav;
    }

    public void setPersonajefav(String personajefav) {
        this.personajefav = personajefav;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getContra() {
        return contra;
    }

    @Override
    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}