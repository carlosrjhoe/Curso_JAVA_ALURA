public class Gerente extends Funcionario { // Gerente herda atributos de Funcionario
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = 1234;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
//	public double getBonificacao(){
//		return this.salario * 0.5;
//	}
	
}
