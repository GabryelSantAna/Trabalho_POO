package Empresa;

public abstract class Moeda {

	protected double valor;
	/*
	 *class abstrata juntando todas as moedas 
	 */
	public abstract void info ();
	public abstract double converter();
}
