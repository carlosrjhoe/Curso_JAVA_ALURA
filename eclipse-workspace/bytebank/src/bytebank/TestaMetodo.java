package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoCarlos = new Conta();
		contaDoCarlos.saldo = 100;
		
		System.out.println(contaDoCarlos.saldo);
		contaDoCarlos.deposita(50);
		System.out.println(contaDoCarlos.saldo);
	}
}
