//Carné: 0904-17-8968  Mélany Menara Gutiérrez Gramajo.
package poli;

public class Rectangulo extends Figura {
 
    /*
        Declaración con el modificador de acceso "protected" para que la subclase que se origina 
        a partir de esta subclase, pueda utilizar todos los campos o atributos que posee.
        Se observa cómo un método puede tomar varias formas según lo que se necesite.
    */
    protected double base;
    protected double altura;

    /*  
        Método constructor con 5 argumentos. El constructor ha heredado los 
        parámetros de la superclase. El polimorfismo ha sido aplicado pues, 
        en este caso se han incluido parámetros adicionales a los que se
        habían establecido en la superclase, dichos parámetros adicionales
        se adaptan a las necesidades de la presente subclase.
    */
    public Rectangulo(double base, double altura, String ladosVertices, double area, double perimetro) {
        super(ladosVertices, area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    /*
        El polimorﬁsmo ocurre ya que se está invocando a un método que la superclase
        ha heredado a la presente subclase, dicho método está siendo sobre escrito y
        además está sobre escribiendo en la siguiente subclase que se origina de esta.
    */
    @Override
    public String imprimirInfo(){
        return "------------R E C T Á N G U L O------------" +
               "\nNúmero de lados: " + ladosVertices + 
               "\nNúmero de vértices: " + ladosVertices +
               "\nÁrea: " + (area = base * altura) + " cm2" + 
               "\nPerímetro: " + (perimetro = 2 * (base + altura)) + " cm" + 
               "\nBase: " + base + " cm" + 
               "\nAltura: " + altura + " cm" ;    
    }
 
}
