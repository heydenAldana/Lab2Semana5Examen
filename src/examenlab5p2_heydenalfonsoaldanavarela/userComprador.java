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
public class userComprador extends userPlantilla
{
    // Atributos
    private ArrayList<String> videojuegosC;
    private double saldo, saldoC;
    private String cuentabancaria;
    private Random rand = new Random();
    
    // Constructor
    public userComprador(String nombre, String username, String contra, int edad, String cuentabancaria)
    {
        super(nombre, username, contra, edad);
        videojuegosC = new ArrayList<String>();
        this.cuentabancaria = cuentabancaria;
        this.saldo = saldoInicial();
        this.saldoC = saldoInicialC();
    }
    
    // Funcion personal para dar saldo a COMPRADOR
    private double saldoInicial() //  Dinero de cuenta bancaria
    {
        try
        {
            int saldo = rand.nextInt(10001) + 2000; 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ADVERTENCIA: Su saldo no pudo ser acreditado a su cuenta.");
            saldo = 0;
        }
        return saldo;
    }
    
    private double saldoInicialC() // Dinero para cmprar
    {
        try
        {
            int saldoC = rand.nextInt(701) + 100; 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ADVERTENCIA: Su saldo no pudo ser acreditado a su cuenta.");
            saldoC = 0;
        }
        return saldoC;
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
            if(videojuegosC.get(pos).equals(nombrevideojuego))
                return videojuegosC.get(pos);
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

    public void setSaldoC(double saldoC) {
        this.saldoC = saldoC;
    }

    public double getSaldoC() {
        return saldoC;
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
