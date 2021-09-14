
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setName("Carlos");
		nico.setCpf("060.199.314-47");
		nico.setSalario(2740.0);
		
		System.out.println(nico.getName());
		System.out.println(nico.getCpf());
		System.out.println(nico.getSalario());
		System.out.println(nico.getBonificacao());
	}
}
