package br.alfa.gc.exemplo_alfa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CirculoTest extends TestCase {
	
	private Circulo circulo;
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CirculoTest( String testName )
    {
        super( testName );
        this.circulo = new Circulo(3.0);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CirculoTest.class );
    }

    public void testCalculoArea()
    {
        assertEquals(28.26, circulo.getArea());
    }

    public void testCalculoPerimetro()
    {
        assertEquals(18.84, circulo.getPerimetro());
    }
}
