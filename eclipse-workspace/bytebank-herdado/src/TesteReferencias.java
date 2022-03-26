
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente neto = new Gerente();
		neto.setNome("Neto");
		neto.setSalario(5000.0);
		
		Designer carlos = new Designer();
		carlos.setSalario(3018.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(neto);
		controle.registra(carlos);
		
		System.out.println(controle.getSoma());
	}
}
