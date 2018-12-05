
package Pack1;

public abstract class Poligono {
    //atributos
    protected int numeroDeLados;
    
    //constructor

    public Poligono(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }
    
    //getters

    public int getNumeroDeLados() {
        return numeroDeLados;
    }
    
    //metodos

    @Override//hereda de object
    public String toString() {
        return "Poligono [" + "Numero de lados = " + numeroDeLados + "]";
    }
    
    public abstract double Area();//declaro el metodo area como abstracto, las clases hijas tendran que implementar el metodo
    
    
    
}
