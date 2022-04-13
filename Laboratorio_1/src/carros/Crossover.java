package carros;

import motores.Motor;


public class Crossover extends CarroBase{
	public Crossover (Motor motor) {
		super(motor);
	}
	
	@Override
	public void imprimirCategoria() {
		System.out.println("soy Crossover");
		imprimirMotor();
	}
	
	public void imprimirCtaegoria(String name) {
		System.out.println(name);
	}
}
