//Carné: 0904-17-8968  Mélany Menara Gutiérrez Gramajo.
package poli;

public class Figura {
    
    /*
        Se declaran las variables con el modificador de acceso "protected" para que 
        las subclases puedan tener acceso ya sea al campo o método. Protected es útil 
        para que los miembros puedan ser utilizados por los miembros de la superclase, 
        los miembros de sus subclases y los miembros de otras clases en el mismo paquete. 
   
        Se declaran los atributos comunes que compartirán la misma subclase. 
   */ 
    protected String ladosVertices;
    protected double area;
    protected double perimetro;

    //Constructor con 3 argumentos el cual se heredará a las subclases.
    public Figura(String ladosVertices, double area, double perimetro) {
        this.ladosVertices = ladosVertices;
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getLadosVertices() {
        return ladosVertices;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    /*
        Método el cual muestra la información de figura. Método del cual se aplicará 
        Override, es decir, la sobre escritura, siendo esta parte del polimorfismo.
    */
    
    public String imprimirInfo(){
        return "----------------F I G U R A----------------" +
               "\nNúmero de lados: " + ladosVertices + 
               "\nNúmero de vértices: " + ladosVertices + 
               "\nÁrea: " + area + " cm2" + 
               "\nPerímetro: " + perimetro + " cm";
    }
    
}
