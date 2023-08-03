package Empresa;

public class Euro extends Moeda{

	public Euro(double primeiroValor) {
		this.valor = primeiroValor;
	}
	
	@Override
	public void info() { //mostra a moeda
		System.out.println("Euro - "+ valor);
		
	}

	@Override
	public double converter() { // converte o valor para Real
		
		return this.valor * 3.3;
	}
	
	@Override
	public boolean equals(Object objeto) { // funcao para remover moeda
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Euro objetoEuro = (Euro) objeto;
		
		if(this.valor != objetoEuro.valor) {
			return false;
		}
		return true;
	}
}
