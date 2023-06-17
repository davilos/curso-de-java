import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        num2 = scanner.nextInt();

        System.out.println("Divisao: " + 5/10 + 5%10);

        System.out.printf("%nA soma dos dois números é %d%nA subtração é %d%nA multiplicação é %d%nA divisão é %d.%d",
                num1+num2, num1-num2, num1*num2, num1/num2, num1%num2);
    }
}
