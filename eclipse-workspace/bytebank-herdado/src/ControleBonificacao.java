
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario emilly) {
		double boni = emilly.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;
	}
}
