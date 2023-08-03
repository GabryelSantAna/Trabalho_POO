package Empresa;

public class Real extends Moeda {

	public Real(double primeiroValor) {
		this.valor = primeiroValor;
	}
	
	@Override
	public void info() { //mostra a moeda
		
		System.out.println("Real - "+ valor);
	}

	@Override
	public double converter() { // converte o valor para Real
		return this.valor;
		
	}
	@Override
	public boolean equals(Object objeto) { // funcao para remover moeda
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real objetoReal = (Real) objeto;
		
		if(this.valor != objetoReal.valor) {
			return false;
		}
		return true;
	}

	
	
}
