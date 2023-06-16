import java.util.Scanner;

public class Exercicio20 {

    static int totalCarrosSemiNovos = 0;
    static int totalCarros = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char continuar = 's';

        receberDados(scanner);

        while (continuar == 's' || continuar == 'S') {
            System.out.print("\n\nDeseja continuar? (s/N): ");
            continuar = scanner.next().charAt(0);

            if (continuar == 's' || continuar == 'S' || continuar == ' ') {
                System.out.println("\nContinuando...");
                receberDados(scanner);
            }
        }

        System.out.println("\nTotal de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }

    public static void receberDados(@org.jetbrains.annotations.NotNull Scanner scanner) {
        int anoVeiculo;
        float valorVeiculo;
        float valorDesconto;

        System.out.print("Digite o ano de fabricação: ");
        anoVeiculo = scanner.nextInt();

        System.out.print("Digite o valor do veículo: R$");
        valorVeiculo = scanner.nextFloat();

        valorDesconto = calcularValorDesconto(anoVeiculo, valorVeiculo);

        System.out.printf("Valor do desconto: R$%.2f%nValor a ser pago: R$%.2f", valorDesconto,
                valorVeiculo-valorDesconto);

        if (anoVeiculo >= 2000) totalCarrosSemiNovos ++;
        totalCarros++;
    }

    public static float calcularValorDesconto(int anoVeiculo, float valorVeiculo) {
        if (anoVeiculo <= 2000) {
            return valorVeiculo * 0.12f;
        } else {
            return valorVeiculo * 0.07f;
        }
    }
}
