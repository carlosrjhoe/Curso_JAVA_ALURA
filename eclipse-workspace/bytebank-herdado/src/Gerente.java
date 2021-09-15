
public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	public void setSenha(int i) {
		//TODO Auto-generated method stub
		
	}

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}
}
