/*
 Ejercicio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero dad la longitud de sus lados. 
Los valores de la longitud deberán introducirse por linea de ordenes. 
Si es un cuadrado, solo se proporcionará la longitud de uno de los lados al constructor.
 */
package Paquete1;


public class Cuadrilatero {
    
    //atributos
    private float lado1;
    private float lado2;
    
    //metodos

    //metodo constructor1, va a servir para los cuadrilateros
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //metodo constructor2, va a servir para los cuadrados
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro()
    {
        float perimetro = 2*(lado1+lado2);
        return perimetro;
    }
    
    public float getArea()
    {
        float area=(lado1*lado2);
        return area;
    }
    
    
}
