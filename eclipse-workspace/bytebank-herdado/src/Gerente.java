public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

    public Cliente(){

        this.setAutenticador(new AutenticacaoUtil());
    }

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha){
			return true;
		} else {
			return false;
		}
	}

	public AutenticacaoUtil getAutenticador() {
		return autenticador;
	}

	public void setAutenticador(AutenticacaoUtil autenticador) {
		this.autenticador = autenticador;
	}

}
