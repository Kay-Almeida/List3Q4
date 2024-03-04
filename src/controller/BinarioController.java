package controller;

public class BinarioController {
	public BinarioController () {
		super(); 
	}
	
	   public String decimalParaBinario(int numero) {
	        // Condição de parada quando o número é zero, retorna a string vazia
	        if (numero == 0) {
	            return "";
	        } else {
	            // chamada recursiva com o quociente e a soma do resto
	            return decimalParaBinario(numero / 2) + String.valueOf(numero % 2);

}
}
}