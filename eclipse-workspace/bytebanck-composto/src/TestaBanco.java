
public class TestaBanco {
	public static void main(String[] args) {
		Cliente carlos = new Cliente();
		carlos.nome = "Carlos Roberto";
		carlos.cpf = "060.199.314-47";
		carlos.profissao = "L?der de manuten??o";
		
		Cliente mayara = new Cliente();
		mayara.nome = "Mayara Ramos";
		mayara.cpf = "300.143.987-90";
		mayara.profissao = "Boleira";
		
		Conta contaDoCarlos = new Conta();
		contaDoCarlos.deposita(100);
		
		Conta contaDaMayara = new Conta();
		contaDaMayara.deposita(100);
		
		contaDoCarlos.titular = carlos;
		contaDaMayara.titular = mayara;
		
		System.out.println("Titular: " + contaDaMayara.titular.nome);
		System.out.println("CPF: " + mayara.cpf);
		System.out.println("Profiss?o: " + mayara.profissao);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Titular: " + contaDoCarlos.titular.nome);
		System.out.println("CPF: " + carlos.cpf);
		System.out.println("Profiss?o: " + carlos.profissao);
	}
}