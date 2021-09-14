
public class TesteGerente {

	public static void main(String[] args) {
		Gerente G1 = new Gerente();
		G1.setName("Mayara");
		G1.setCpf("256985458-95");
		G1.setSalario(5000.0);
		
		System.out.println(G1.getName());
		System.out.println(G1.getCpf());
		System.out.println(G1.getSalario());
		
		G1.setSenha(2222);
		boolean autentica = G1.autentica(2222);
		
		System.out.println(autentica);
	}
}
