
public class TesteIR {

		public static void main(String[] args) {
			
			double salario = 2150.00;
			
			if (salario <= 2600.00) {
				System.out.println("A sua aliquota � de 15%");
				System.out.println("Voc� pode reduzir at� R$350.00");
			}
			if (salario >= 3750.00){
				System.out.println("A sua aliquota � de 22,5%");
				System.out.println("Voc� pode reduzir at� R$636.00");
			}
		}
}
