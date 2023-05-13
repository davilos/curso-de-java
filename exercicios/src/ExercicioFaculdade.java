import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioFaculdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(); // Lista de inteiros com tipos não primitivos


        //

        // Laço de repetição para receber os números que o usuário fornece
        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int num = scanner.nextInt();
            list.add(num);
        }


        //
        System.out.println("Número pares:");

        // Laço de repetição para exibir todos os números pares contidos na lista
        for (int i = 0; i < 5; i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i));
            }
        }


        //
        System.out.print("Menor número da lista: ");

        /*list.sort(null); // Ordenando a lista do menor para o maior
        System.out.println(list.get(0));*/ // Exibindo o menor número

        Integer num = list.get(0);

        // Laço de repetição para definir o menor número da lista
        for (int i = 1; i < 5; i++) {
            if (list.get(i) < num) {
                num = list.get(i);
            }
        }

        System.out.println(num);


        //
        System.out.print("Quantidade de valores maiores que a média:");

        double sum = 0.0;
        // Laço de repetição para definir a soma dos valores da lista
        for (int i = 0; i < 5; i++) {
            sum += list.get(i);
        }

        double average = sum / 5; // Média dos valores da lista

        // Laço de repetição para contar quantos valores são maiores que a média
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (list.get(i) > average) {
                count += 1;
            }
        }

        System.out.println(count);

    }
}
