
public class TestaContaSemCliente {
	public static void main(String[] args) {
		
		Conta contaDaLuna = new Conta();
		contaDaLuna.titular = new Cliente();
		
		contaDaLuna.titular.nome = "Luna";
		System.out.println(contaDaLuna.titular.nome);
	}
}
