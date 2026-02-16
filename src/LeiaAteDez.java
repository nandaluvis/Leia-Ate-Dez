import java.util.Scanner;

public class LeiaAteDez {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao programa que lê caracteres do usúario até que ele digite 10.");

        Scanner scanner = new Scanner(System.in);
        String caractereEscolhido = scanner.nextLine();


        while (!caractereEscolhido.equals("10")){

            System.out.println("Você digitou: " + caractereEscolhido);

            System.out.println("Digite qualquer caractere, exceto o número 10 para ser exibido.");
            System.out.println("Digite o número 10 para sair. ");
            caractereEscolhido = scanner.nextLine();

        }

        scanner.close();
        System.out.println("Você saiu.");
    }
}
