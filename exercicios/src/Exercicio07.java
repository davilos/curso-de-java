import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        int celsius;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma temperatura em graus Celsius: ");
        celsius = scanner.nextInt();

        System.out.printf("%dº Celsius convertido pra Fahrenheit é %dº", celsius, (9 * celsius + 160) / 5);

    }
}
