
public class TestaCondicional {
	public static void main(String[] args) {

		int idade = 36;
		if (idade >= 18) {
			System.out.println("Voc� tem " +idade+ " anos");
			System.out.println("Voc� tem mais de 18 anos!");
			System.out.println("Pode entrar...");
			
		} else {
			System.out.println("Voc� tem " +idade+ " anos");
			System.out.println("Voc� � menor de idade.");
			System.out.println("Voc� n�o Pode entrar...");
		}
		System.out.println();
	}
}
