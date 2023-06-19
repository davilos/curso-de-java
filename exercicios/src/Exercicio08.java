import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        float valorEmDolar;
        float cotacaoDolar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor da cotação do dólar? R$");
        cotacaoDolar = scanner.nextFloat();

        System.out.print("\nQual a quantidade de doláres que você possui? $");
        valorEmDolar = scanner.nextFloat();

        System.out.printf("%nEm reais, você possui: R$%f", valorEmDolar*cotacaoDolar);
    }
}
