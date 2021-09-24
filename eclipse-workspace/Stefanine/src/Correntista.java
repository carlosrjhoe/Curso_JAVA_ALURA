import java.util.Scanner;

public class Correntista {

	public static void main(String[] args){



        Scanner s = new Scanner(System.in);

        System.out.println("Informe seu nome: ");

        String correntista = s.nextLine();



        if(correntista.equals("Carlos")){

            double saldoLiquido = 200_000.00;

            double saldoPostDeposit;

            double saldoPostSaque;



            System.out.println("Digite:\n 1 para Depositos\n 2 para Saques\n 3 para visualizar seu Saldo.");

            int escolha = s.nextInt();



            if(escolha == 1){

                System.out.println("Digite o valor para dep�sito: ");

                double valorDeposito = s.nextDouble();

                saldoPostDeposit = saldoLiquido + valorDeposito;

                System.out.println("Seu novo saldo � de: " + saldoPostDeposit);

            }else if(escolha == 2){

                System.out.println("Digite o valor para saque: ");

                double valorSaque = s.nextDouble();

                saldoPostSaque = saldoLiquido - valorSaque;

                System.out.println("Seu novo saldo � de: " + saldoPostSaque);

            }else if(escolha == 3){

                System.out.println("Seu saldo � de: " + saldoLiquido);

            }else{

                System.out.println("Voc� n�o escolheu dentre as op��es corretas.");

                System.out.println("Opera��o cancelada.");

                System.exit(escolha);

            }



        }else{

            System.out.println("Seu nome n�o consta em nossos cadastros.");

            System.out.println("Opera��o cancelada.");

        }
    }
}
