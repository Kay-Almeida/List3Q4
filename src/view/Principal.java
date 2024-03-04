package view;

import controller.BinarioController;

public class Principal {
	public static void main(String[] args) {
		BinarioController bn = new BinarioController(); 
		
		int numero = 25; 
		
		if (numero<=2000) {
			System.out.println("O numero "+ numero + " em binário é "+ bn.decimalParaBinario(numero));
		}else {
			System.out.println("Entrada inválida!");
		}
	}
	

}
