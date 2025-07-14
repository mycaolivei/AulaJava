package Encapsulamento;

public class Retangulo {
	private double base;
	private double altura;


public  void retangulo(double base, double altura) {
	this.base=base;
	this.altura=altura;
}
	
public double calcularRetangulo() {
	return base*altura;
}
	



public void setAltura(double altura) {
	this.altura = altura;
}
}