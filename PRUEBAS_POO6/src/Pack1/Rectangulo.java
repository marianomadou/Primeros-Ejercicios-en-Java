
package Pack1;

public class Rectangulo extends Poligono{
    //atributos
    private double lado1;
    private double lado2;
    
    //constructor
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
    
    //metodos

    @Override
    public String toString() {
        return "Rectangulo:\n" +super.toString()+ "\nLado 1: " + lado1 + " - Lado 2: " + lado2;
    }
    
    @Override
    public double Area(){
        return lado1*lado2;
    }
            
    
}
