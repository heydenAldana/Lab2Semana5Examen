package examenlab5p2_heydenalfonsoaldanavarela;

public class videojuego 
{
    // Atributos
    private String nombre;
    private int yeardebut, cantidad;
    private double precio;
   
    // Constructor
    public videojuego(String nombre, int yeardebut, int cantidad, double precio)
    {
        this.nombre = nombre;
        this.yeardebut = yeardebut;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    // Funciones get y set para modificar

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYeardebut() {
        return yeardebut;
    }

    public void setYeardebut(int yeardebut) {
        this.yeardebut = yeardebut;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
