
public abstract class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

    public void Cliente(){

        this.setAutenticador(new AutenticacaoUtil());
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
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
