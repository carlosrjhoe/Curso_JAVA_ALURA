
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	private int senha;

    public Cliente(){

        this.setAutenticador(new AutenticacaoUtil());
    }
    
    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha){

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
