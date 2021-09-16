import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {

        System.out.println("INFORME O NOME DA PESSOA: ");

        Scanner sc = new Scanner(System.in);

        String nomePessoa = sc.next();



        System.out.println("INFORME A IDADE DA PESSOA: ");

        Integer idade = Integer.valueOf(sc.next());

        sc.close();



        if (idade >= 18 && idade < 65) {

            System.out.println(nomePessoa + " é MAIOR DE IDADE");

            return;

        }



        if (idade >= 65) {

            System.out.println(nomePessoa + " é MAIOR OU IGUAL À 65 ANOS");

            return;

        }



        if (idade < 18 && idade > 12) {

            System.out.println(nomePessoa + " é MENOR DE IDADE");

            return;

        }



        if (idade <= 12) {

            System.out.println(nomePessoa + " é MENOR OU IGUAL 12 ANOS");

            return;

        }

    }
}
