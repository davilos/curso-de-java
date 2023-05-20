import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Float> listaCusto = new ArrayList<>();
        List<Float> listaVenda = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("-------------- Produto %d --------------%n", i+1);

            System.out.print("Digite o preço de custo: ");
            Float precoCusto = scanner.nextFloat();

            System.out.print("Digite o preço de venda: ");
            Float precoVenda = scanner.nextFloat();

            if (precoCusto > precoVenda) {
                System.out.println("Houve prejuízo!");
            } else if (precoCusto < precoVenda) {
                System.out.println("Houve lucro!");
            } else {
                System.out.println("Houve empate!");
            }

            listaCusto.add(precoCusto);
            listaVenda.add(precoVenda);

        }

        // Acessa a listaCusto para informar os valores
        System.out.println("\nValor de custo de cada produto: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf(Locale.US, "Produto %d: %.2f%n", i+1, listaCusto.get(i));
        }

        // Acessa a listaVenda para informar os valores
        System.out.println("Valor da venda de cada produto: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf(Locale.US, "Produto %d: %.2f%n", i+1, listaVenda.get(i));
        }

        double mediaCusto = listaCusto.stream().reduce(0f, Float::sum) / listaCusto.size();

        double mediaVenda = listaVenda.stream().reduce(0f, Float::sum) / listaVenda.size();

        System.out.printf(Locale.US, "%nA média do preço de custo é: %.2f%n" +
                "A média do preço de venda é: %.2f", mediaCusto, mediaVenda);
    }
}
