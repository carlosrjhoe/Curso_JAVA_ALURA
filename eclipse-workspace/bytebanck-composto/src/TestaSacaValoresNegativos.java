
public class TestaSacaValoresNegativos {
	public static void main(String[] args) {
		Conta contaDoNeto = new Conta();
		contaDoNeto.deposita(100);
		System.out.println(contaDoNeto.saca(200));
		System.out.println(contaDoNeto.getSaldo());
	}
}
