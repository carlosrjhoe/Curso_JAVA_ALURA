package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoCarlos = new Conta();
		Conta contaDaMayara = new Conta();
		contaDoCarlos.saldo = 100;
		contaDaMayara.saldo = 100;
		
		System.out.println("Conta do Carlos: R$" + contaDoCarlos.saldo);
		System.out.println("Conta da mayara: R$" + contaDaMayara.saldo);
		//contaDoCarlos.deposita(50);
		//contaDoCarlos.saca(20);
		//System.out.println(contaDoCarlos.saldo);
		
		if(contaDoCarlos.transfere(90, contaDaMayara)) {
			System.out.println("Tranferencia realizada");
			System.out.println("Conta do Carlos: R$" + contaDoCarlos.saldo);
			System.out.println("Conta da mayara: R$" + contaDaMayara.saldo);
		} else {
			System.out.println("Saldo insuficiente...");
		}
	}
}
