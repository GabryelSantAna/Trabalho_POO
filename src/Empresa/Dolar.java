package Empresa;

public class Dolar extends Moeda{

	public Dolar(double primeiroValor) {
		this.valor = primeiroValor;
	}
	
	@Override
	public void info() { //mostra a moeda
		System.out.println("Dolar - "+ valor);
		
	}

	@Override
	public double converter() { // converte o valor para Real
		
		return this.valor * 5.2;
	}
	
	@Override
	public boolean equals(Object objeto) { // funcao para remover moeda
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDolar = (Dolar) objeto;
		
		if(this.valor != objetoDolar.valor) {
			return false;
		}
		return true;
	}


}
