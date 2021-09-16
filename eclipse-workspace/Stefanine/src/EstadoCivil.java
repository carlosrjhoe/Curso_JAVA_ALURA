import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) {

        System.out.println("DIGITE UMA DAS OPCOES ABAIXO: ");

        System.out.println("1 - SOLTEIRO(A)");

        System.out.println("2 - DESQUITADO(A)");

        System.out.println("3 - CASADO(A)");

        System.out.println("4 - DIVORCIADO(A)");

        System.out.println("5 - VIUVO(A)");

        Scanner sc = new Scanner(System.in);

        Integer estadoCivil = Integer.valueOf(sc.next());

        sc.close();



        switch(estadoCivil) {

            case 1: System.out.println("O estado civil é 1 - SOLTEIRO(A)"); break;

            case 2: System.out.println("O estado civil é 2 - DESQUITADO(A)"); break;

            case 3: System.out.println("O estado civil é 3 - CASADO(A)"); break;

            case 4: System.out.println("O estado civil é 4 - DIVORCIADO(A)"); break;

            case 5: System.out.println("O estado civil é 5 - VIUVO(A)");break;

            default: System.out.println("Opção INVÁLIDA");break;

        }
    }
}
