
public class TestaCondicional2 {
	public static void main(String[] args) {

		int idade = 17;
		int quantidadePessoas = 2;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos, Pode entrar...");	
		} else {
			if(quantidadePessoas > 2) {
				System.out.println("Voc� tem " +idade+ " anos, mas, est� acompanhado com pessoas maiores de 18 anos.");
			} else {
				System.out.println("Voc� n�o Pode entrar...");
			}
		}
	}
}
