public class EditorDeVideo extends Funcionario { // Gerente herda atributos de Funcionario

	public double getBonificacao() {
		return super.getBonificacao() + 100; // O super significa que � um atributo da classe M�e. quando o atributo for
															// extendido de outra classe, � uma boa pr�tica colocar como super.
	}

}
