package br.alfa.gc.exemplo_alfa;

public class Circulo {
	private Double raio;
	
	private static final Double PI = 3.14;
	
	public Circulo(Double raio) {
		this.raio = raio;		
	}
	
	public Double getArea() {
		return this.raio * this.raio * PI;
	}
	
	public Double getPerimetro() {
		return this.raio * 2 * PI;
	}
	
	
}
