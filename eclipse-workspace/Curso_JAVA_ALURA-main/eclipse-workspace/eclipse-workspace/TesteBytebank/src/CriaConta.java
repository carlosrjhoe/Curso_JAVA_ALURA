
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100.0;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 100.0;
		
		System.out.println("A primeira conta � : " + primeiraConta);
		System.out.println("O saldo da primeira conta � : \tR$" + primeiraConta.saldo);
		System.out.println();
		System.out.println("A segunda conta � : " + segundaConta);
		System.out.println("O saldo da segunda conta � : \tR$" + segundaConta.saldo);
	}
}
