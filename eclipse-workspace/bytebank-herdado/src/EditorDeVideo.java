public class EditorDeVideo extends Funcionario { // Gerente herda atributos de Funcionario

	public double getBonificacao() {
		return super.getBonificacao() + 100; // O super significa que é um atributo da classe Mãe. quando o atributo for
															// extendido de outra classe, é uma boa prática colocar como super.
	}

}
