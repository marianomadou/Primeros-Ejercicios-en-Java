/*
Encapsulamiento y metodos accesores (Setters y Getters)
 */
package paquete1;



public class Clase1 {
    //atributos
    private int edad;
    private String nombre;
    
    public void setEdad(int edad)//metodo Setter, establecemos la edad
    {
        this.edad=edad;
    }
    
    public int getEdad()//metodo getter, mostramos la edad
    {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
