//Carné: 0904-17-8968  Mélany Menara Gutiérrez Gramajo.
package poli;

public class Circulo extends Figura {

    private double radio;
    /*  
        Método constructor con 4 argumentos. El constructor ha heredado los 
        parámetros de la superclase. El polimorfismo ha sido aplicado pues, 
        en este caso se han incluido parámetros adicionales a los que se
        habían establecido en la superclase, dichos parámetros adicionales
        se adaptan a las necesidades de la presente subclase.
    */
    public Circulo(double radio, String ladosVertices, double area, double perimetro) {
        super(ladosVertices, area, perimetro);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    /*
        El polimorﬁsmo ocurre ya que se está invocando a un método que la superclase
        ha heredado a la presente subclase, dicho método está siendo sobre escrito.
        Se observa cómo un método puede tomar varias formas según lo que se necesite.
    */
    @Override
    public String imprimirInfo(){
        return "---------------C Í R C U L O---------------" +
               "\nNúmero de lados: " + ladosVertices + 
               "\nNúmero de vértices: " + ladosVertices + 
               "\nRadio: " + radio + " cm" +
               "\nÁrea: " + (area = 3.1416 * (radio * radio) ) + " cm2" +
               "\nPerímetro: " + (perimetro = 3.1416 * (radio * 2)) + " cm";    
    } 
}
