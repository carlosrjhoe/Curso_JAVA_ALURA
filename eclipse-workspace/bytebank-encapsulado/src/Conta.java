public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		// Construtor
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public void deposita(double valor) {
		// Metodo depositar
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		// Metodo sacar
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		// Metodo tranferir
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valores menores que 0.");
		} else {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valores menores que 0.");
		} else {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

	public static int setTotal() {
		return Conta.total;
	}
}