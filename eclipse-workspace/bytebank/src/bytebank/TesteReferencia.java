package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 300;
		segundaConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: R$" + primeiraConta);
		
		// Conta segundaConta = primeiraConta;
		// segundaConta.saldo = 400;
		
		System.out.println("Saldo da segunda conta: R$" + segundaConta);
		
		System.out.println(primeiraConta == segundaConta);
	}
}
