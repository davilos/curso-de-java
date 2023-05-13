import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int num = scanner.nextInt();

        if (num >= 100 && num <= 200){
            System.out.println("Este número está entre 100 e 200.");
        } else {
            System.out.println("Este número não se encontra no intervalo de 100 a 200.");
        }

    }
}
