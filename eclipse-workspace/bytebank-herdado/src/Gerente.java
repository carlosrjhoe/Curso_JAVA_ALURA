public class Gerente extends Funcionario { // Gerente herda atributos de Funcionario

	private int senha;

	public void setSenha(int senha) {
		this.senha = 1234;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		return super.getBonificacao(); // O super significa que � um atributo da classe M�e. quando o atributo for
															// extendido de outra classe, � uma boa pr�tica colocar como super.
	}

}
