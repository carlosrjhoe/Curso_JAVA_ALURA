package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		// Criando conta nova
		Conta primeiraConta = new Conta();
		Conta secundaConta = new Conta();
		Conta terceiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		secundaConta.saldo = 300;
		terceiraConta.saldo = 150;
		
		// Imprimindo informações
		System.out.println("Saldo da primeira conta = R$" + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta = R$" + secundaConta.saldo);
		System.out.println("Saldo da terceira conta = R$" + terceiraConta.saldo);
		System.out.println("Agencia: " + secundaConta.agencia);
	}
}
