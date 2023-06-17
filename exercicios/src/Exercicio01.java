import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o 2º número: ");
        num2 = scanner.nextInt();

        System.out.println("A soma dos dois números é " + num1+num2);
    }
}
