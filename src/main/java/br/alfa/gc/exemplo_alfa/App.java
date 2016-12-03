package br.alfa.gc.exemplo_alfa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Circulo circulo = new Circulo(3.0);
    	
        System.out.println( "Area do Circulo: " + circulo.getArea() );
        System.out.println( "Perimetro do Circulo: " + circulo.getPerimetro() );
    }
}
