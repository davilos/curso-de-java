import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio05 {

    static String nomeAluno;
    static List<Double> notasAluno;

    public static void main(String[] args) {
        cadastrarAluno();

        System.out.printf("%nNome: %s%nMédia: %.2f", nomeAluno, calcularMedia(notasAluno));
    }

    public static void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
        notasAluno = new ArrayList<>();

        System.out.print("Digite o nome do aluno: ");
        nomeAluno = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a nota da %dº prova: ", i+1);
            notasAluno.add(scanner.nextDouble());
        }
    }

    @Contract(pure = true)
    public static double calcularMedia(@NotNull List<Double> lista) {
        double soma = 0.0;

        for (double numero: lista) {
            soma += numero;
        }
        return soma / 3;
    }
}
