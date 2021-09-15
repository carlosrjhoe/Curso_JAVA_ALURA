
public class ControleBonificacao {

	private Object soma;

	public void registra(Funcionario f) {
	    double boni = f.getBonificacao();
	    this.soma = this.soma + boni;
	}

	public double getSoma() {
	    return this.soma;
	}

	public void registra(EditorVideo ev) {
		// TODO Auto-generated method stub
		
	}

	public void registra(Designer d) {
		// TODO Auto-generated method stub
		
	}
}
