
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getTitular());
		System.out.println(conta.getNumero());
		
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos");
		carlos.setCpf("060.199.314-47");
		conta.setTitular(carlos);
		carlos.setProfissao("L�der de manuten��o");
		
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
	}
}
