
public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 2740.50;
		int valor = (int) salario;
		
		float pontoFlutuante = 3.14f;
		
		System.out.println(valor);
		System.out.println(pontoFlutuante);
		
		long numeroGrande = 32659874585l;
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
				
		System.out.println(total);
	}
	
}