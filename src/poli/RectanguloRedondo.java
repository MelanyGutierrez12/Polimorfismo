//Carné: 0904-17-8968  Mélany Menara Gutiérrez Gramajo.
package poli;

public class RectanguloRedondo extends Rectangulo {
    
    private int esquinasRedondas;
    private double radioEsquina;

    /*  
        Método constructor con 7 argumentos. El constructor ha heredado los 
        parámetros de la subclase a la que pertenece. El polimorfismo ha sido
        aplicado pues, en este caso se han incluido parámetros adicionales a 
        los que se habían establecido desde la superclase, dichos parámetros 
        adicionales se adaptan a las necesidades de la presente subclase.
    */
    public RectanguloRedondo(int esquinasRedondas, double radioEsquina, double base, double altura, String ladosVertices, double area, double perimetro) {
        
        super(base, altura, ladosVertices, area, perimetro);
        this.esquinasRedondas = esquinasRedondas;
        this.radioEsquina = radioEsquina;
    }

    public int getEsquinasRedondas() {
        return  esquinasRedondas;
    }
    
    public double getRadioEsquina() {
        return radioEsquina;
    }
     
    /*
        El polimorﬁsmo ocurre ya que se está invocando a un método que la superclase
        ha heredado a la subclase de la cual se origina la subclase presente, dicho 
        método está siendo sobre escrito. Se puede observar cómo un método puede 
        tomar varias formas según lo que se necesite por medio del polimorfismo.
    */
    @Override
    public String imprimirInfo(){
        return "----R E C T Á N G U L O   R E D O N D O----" +
               "\nNúmero de lados: " + ladosVertices + 
               "\nNúmero de vértices: " + ladosVertices + 
               "\nBase: " + base + " cm" +  
               "\nAltura: " + altura + " cm" +  
               "\nRadio de las esquinas redondas:" + radioEsquina + 
               "\nÁrea: " + (area = base * altura) + " cm2" + 
               "\nPerímetro: " + (perimetro = 2 * (base + altura)) + " cm" +
               "\nNúmero de esquinas redondas: " + esquinasRedondas ;
    }
    
    
}
