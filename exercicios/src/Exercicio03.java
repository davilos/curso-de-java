import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        float totalDistancia;
        float totalCombustivel;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total da distância percorrida pelo automóvel: ");
        totalDistancia = scanner.nextFloat();

        System.out.print("Digite o total de combustível gasto: ");
        totalCombustivel = scanner.nextFloat();

        System.out.println(calcularConsumo(totalDistancia, totalCombustivel));

    }

    @Contract(pure = true)
    public static @NotNull String calcularConsumo(float distancia, float combustivel) {
        return "O consumo médio desse automóvel é: " + distancia / combustivel + " km/l";
    }
}
