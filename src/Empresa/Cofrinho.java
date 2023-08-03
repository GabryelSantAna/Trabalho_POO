package Empresa;

import java.util.ArrayList; //chama ArrayList
import java.util.List; //chama list

public class Cofrinho {
	
	private List<Moeda> listaMoedas;
	
	
	public Cofrinho() { // faz uma lista de todas as moedas
		this.listaMoedas = new ArrayList<>();
		
	}
	
	public void adicionar(Moeda moeda) { // adiona todas as moedas na lista
		this.listaMoedas.add(moeda);
	}
	
	public void listagemMoedas(){ // mostra todas as moedas da lista
		
		if(this.listaMoedas.isEmpty()) {
			System.out.println("Nao existe nenhuma moeda");
			return;
		}
		
		for(Moeda moeda: this.listaMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() { // converte todas as moedas da lista para real
		
		if(this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double valorAcumulativo = 0;
		
		for(Moeda moeda: this.listaMoedas) {
			valorAcumulativo = valorAcumulativo + moeda.converter();
		}
		return valorAcumulativo;
	}

	public void Remover(Moeda moeda) { //remove a moeda escolida
		this.listaMoedas.remove(moeda);
		
	}


	
}
