
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(250.01);
		System.out.println(conta.saldo);
		
		conta.saca(150);
		System.out.println(conta.saldo);
	}
}
