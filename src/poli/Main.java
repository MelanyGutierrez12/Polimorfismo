//Carné: 0904-17-8968  Mélany Menara Gutiérrez Gramajo.
package poli;

public class Main {
  
    public static void main(String[] args){
        
        //Crea un arreglo Figura de 5 elementos
        Figura misFiguras[] = new Figura[5];
        
        /*
        Inicializa el arreglo con objetos Figura, se puede observar que el 
        polimorfismo ha sido aplicado ya que los distintos objetos instanciados 
        han heredado el mismo método, pero dicho método ha sido instanciado de 
        manera distinta para cada uno de los objetos instanciados.
        */
        misFiguras[0] = new Figura("cuatro", 100, 40); //Tres argumentos (método original)
        misFiguras[1] = new Circulo(3, "ninguno", 28.27, 18.85); //Cuatro argumentos (método heredado)
        misFiguras[2] = new Rectangulo(38, 21, "cuatro", 798, 118); //Cinco argumentos (método heredado)
        misFiguras[3] = new RectanguloRedondo(4, 1.50 , 30, 20, "cuatro", 600, 100); //Siete argumentos (método heredado)
        misFiguras[4] = new Triangulo("Isóceles", 24.45, 24.25, 36, "tres", 3.90, 15); //Siete argumentos (método heredado)
        
       //Se procesa de manera genérica a cada elemento del arreglo Figura. 
        for(Figura figuras: misFiguras){
            System.out.println("");
            System.out.println(figuras.imprimirInfo());
            System.out.println("-------------------------------------------");
        }
    }
}
