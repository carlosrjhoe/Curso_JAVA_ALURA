
public class TestaValores {
	public static void main(String[] args) {
		
		Conta contaCarlos = new Conta(1599, 2028786);
		System.out.println("Agencia: " + contaCarlos.getAgencia());
		System.out.println("Cc: " + contaCarlos.getNumero());
		
		Conta contaMayara = new Conta(1599, 2038786);
		System.out.println("Agencia: "+ contaMayara.getAgencia());
		System.out.println("Cc: " + contaMayara.getNumero());
		
		Conta contaNeto = new Conta(1599, 2048786);
		System.out.println("Agencia: " + contaNeto.getAgencia());
		System.out.println("Cc: " + contaNeto.getNumero());
		
		System.out.println("Total de contas: " + Conta.getTotal());
	}
}
