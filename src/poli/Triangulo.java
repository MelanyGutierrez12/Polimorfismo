//Carné: 0904-17-8968  Mélany Menara Gutiérrez Gramajo.
package poli;

public class Triangulo extends Figura {
   
    private String tipo;
    private double lado1;
    private double lado2;
    private double lado3;

    /*  
        Método constructor con 7 argumentos. El constructor ha heredado los 
        parámetros de la superclase. El polimorfismo ha sido aplicado pues, 
        en este caso se han incluido parámetros adicionales a los que se
        habían establecido en la superclase, dichos parámetros adicionales
        se adaptan a las necesidades de la presente subclase.
    */
    public Triangulo(String tipo, double lado1, double lado2, double lado3, String ladosVertices, double area, double perimetro) {
        super(ladosVertices, area, perimetro);
        this.tipo = tipo;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String getTipo() {
        return tipo;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
   
    /*
        El polimorﬁsmo ocurre ya que se está invocando a un método que la superclase
        ha heredado a la presente subclase, dicho método está siendo sobre escrito.
        Se observa cómo un método puede tomar varias formas según lo que se necesite.
    */
    @Override
    public String imprimirInfo(){
        return "-------------T R I Á N G U L O-------------" +
               "\nNúmero de lados: " + ladosVertices + 
               "\nNúmero de vértices: " + ladosVertices + 
               "\nTipo: " + tipo +
               "\nLado 1: " + lado1 + " cm" + 
               "\nLado 2: " + lado2 + " cm" + 
               "\nLado 3: " + lado3 + " cm" +
               "\nÁrea: " + (area = (lado1*lado2)/2) + " cm2" + 
               "\nPerímetro: " + (perimetro = lado1 + lado2 + lado3) + " cm" ;
    }
    
}
