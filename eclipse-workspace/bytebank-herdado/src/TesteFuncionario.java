public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente carlos = new Gerente(); // Objeto
		carlos.setNome("Carlos Roberto");
		carlos.setCpf("060.199.314-47");
		carlos.setSalario(2740.00);
		
		System.out.println(carlos.getNome());
		System.out.println(carlos.getBonificacao());
	}
}
