import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {

        System.out.println("INFORME O NOME DA PESSOA: ");

        Scanner sc = new Scanner(System.in);

        String nomePessoa = sc.next();



        System.out.println("INFORME A IDADE DA PESSOA: ");

        Integer idade = Integer.valueOf(sc.next());

        sc.close();



        if (idade <= 10) {

            System.out.println("O valor do plano para" + nomePessoa + " é R$30,00");

        }



        if (idade > 10 && idade <= 29) {

            System.out.println("O valor do plano para" + nomePessoa + " é R$60,00");

        }



        if (idade > 29 && idade <= 45) {

            System.out.println("O valor do plano para" + nomePessoa + " é R$120,00");

        }



        if (idade > 45 && idade <= 59) {

            System.out.println("O valor do plano para" + nomePessoa + " é R$150,00");

        }



        if (idade > 59 && idade <= 65) {

            System.out.println("O valor do plano para" + nomePessoa + " é R$250,00");

        }



        if (idade> 65) {

            System.out.println("O valor do plano para" + nomePessoa + " é R$400,00");

        }



    }
}
