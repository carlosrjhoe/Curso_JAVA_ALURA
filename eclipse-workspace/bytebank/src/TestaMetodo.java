
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(250.00);
		System.out.println(conta.saldo);
		
		conta.saca(150.0);
		System.out.println(conta.saldo);
		
		Conta contaJhoe = new Conta();
		contaJhoe.deposita(200.00);
		
		if(contaJhoe.transfere(1000, conta)) {
			System.out.println("Transferencia realizada!");
		} else {
			System.out.println("faltou dinheiro!");
		}
		System.out.println(conta.saldo);
		System.out.println(contaJhoe.saldo);
	}
}
