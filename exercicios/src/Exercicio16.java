import java.util.*;

public class Exercicio16 {

    public static void main(String[] args) {

        List<Float> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        float soma = 0.0f;

        System.out.print("Digite seu nome: ");
        String nome = scanner.next().strip();
        String nomeMaisculo = nome.substring(0, 1).toUpperCase() + nome.substring(1);

        System.out.print("Digite suas três notas obtidas: ");
        Collections.addAll(lista, scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

        for (Float aFloat : lista) {
            soma += aFloat;
        }

        System.out.printf(Locale.US, "Olá %s, a sua média é %.1f", nomeMaisculo, soma / lista.size());
    }
}
