import java.util.Scanner;

    public class tabuada {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Tabuada");
            System.out.print("Digite um número para calcular a tabuada: ");
            int numero = scanner.nextInt();

            System.out.println("\nTabuada do " + numero);
            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }

            scanner.nextLine();

            int opcao;
            do {
                System.out.println("Selecione a opção:");
                System.out.println("1 - Continuar");
                System.out.println("2 - Sair");
                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 1) {
                    System.out.print("Digite uma palavra ou frase: ");
                    String frase = scanner.nextLine();
                    System.out.println("Você digitou: " + frase);
                } else if (opcao == 2) {
                    System.out.println("\nObrigado por utilizar o nosso sistema, espero que tenha gostado.");
                } else {
                    System.out.println("\nOpção inválida! Tente novamente.");
                }

            } while (opcao != 2);

            scanner.close();
        }
    }

