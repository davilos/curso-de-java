import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Digite o número: ");
            int testNum = scanner.nextInt();

            if (testNum > 0) {
                System.out.println("O número é positivo.");
            } else if (testNum < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }

            System.out.println("Deseja continuar? [S/n]");
            continuar = scanner.next().charAt(0);

            System.out.println();
        }
    }
}
