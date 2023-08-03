package Empresa;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void exibirMenuPrincipal() { // Chama o menu Principal
		System.out.println("COFRINHO: ");
		System.out.println("1-ADICIONAR MOEDA: ");
		System.out.println("2-REMOVER MOEDA: ");
		System.out.println("3-LISTAR MOEDAS: ");
		System.out.println("4-CALCULAR O VALOR TOTAL CONVERTIDO PARA REAL: ");
		System.out.println("0-ENCERRAR: ");
		
		String opcaoSelecionada = sc.next();
		
		switch(opcaoSelecionada) {
		
		case "0": // Sai do programa
			System.out.println("Finalizando Programa!");
			break;
			
		
		case "1": // adiciona um novo valor de moeda
			segundoMenuAddMoeda();
			exibirMenuPrincipal();
			break;
		
		case"2": // remove a moeda escolhida
			terceiroMenuRemoverMoeda();
			exibirMenuPrincipal();
			break;
		
		case"3": // lista todas as moedas adicionadas
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			break;
			
		case"4": //converte todas as moedas para o valor da moeda real
			double valorTotalConvertido = cofrinho.totalConvertido();
			System.out.println("O valor toal convertido para real ? "+ valorTotalConvertido);
			exibirMenuPrincipal();
			break;
			
		default:
			System.out.println("Opcao Invalida!");
			exibirMenuPrincipal();
			break;
		}
	}
	private void terceiroMenuRemoverMoeda () { //Funcao para remover moeda
		System.out.println("Escolha moeda");
		System.out.println("1 = Real: ");
		System.out.println("2 - Dolar: ");
		System.out.println("3 - Euro: ");
		
		int opcaoDaMoeda = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		String valorTxt = sc.next();
		
		valorTxt = valorTxt.replace(",",".");
		double valorMoeda = Double.parseDouble(valorTxt);
		
		Moeda moeda = null;
		
		if(opcaoDaMoeda == 1) {
			moeda = new Real (valorMoeda);
		}else if (opcaoDaMoeda == 2) {
			moeda = new Dolar (valorMoeda);
		}else if(opcaoDaMoeda == 3) {
			moeda = new Euro (valorMoeda);
		}else {
			System.out.println("Nao existe essa Moeda!!");
			exibirMenuPrincipal();
		}
		
		cofrinho.Remover(moeda);
		System.out.println("Sucesso!");
		
	}
	private void segundoMenuAddMoeda () { // funcao para adicionar moeda
		System.out.println("Escolha moeda");
		System.out.println("1 = Real: ");
		System.out.println("2 - Dolar: ");
		System.out.println("3 - Euro: ");
		
		int opcaoDaMoeda = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		String valorTxt = sc.next();
		
		valorTxt = valorTxt.replace(",",".");
		double valorMoeda = Double.parseDouble(valorTxt);
		
		Moeda moeda = null;
		
		if(opcaoDaMoeda == 1) {
			moeda = new Real (valorMoeda);
		}else if (opcaoDaMoeda == 2) {
			moeda = new Dolar (valorMoeda);
		}else if(opcaoDaMoeda == 3) {
			moeda = new Euro (valorMoeda);
		}else {
			System.out.println("Nao existe essa Moeda!!");
			exibirMenuPrincipal();
		}
		
		cofrinho.adicionar(moeda);
		System.out.println("Sucesso!");
		
	}
}
