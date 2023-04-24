import java.util.Scanner;

public class MeuPrimeiroPrograma {

    public static void main(String[] args) {
        // calc(10, 15); // Argumentos -> 10 e 5

        Scanner input = new Scanner(System.in);

        System.out.print("Diga seu nome: ");
        String nome = input.next();

        diz_ola(nome);

        input.close();
    }

    static void calc(int a, int b) {
        // static void -> Declaração padrão.
        // calc -> Nome da função.
        // () -> Usamos para definir o que chegará naquela função (parâmetros).
        // (tipo nomeDaVariavel)
        // {} -> Bloco de código que será executado.

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
    }

    static void diz_ola(String nome) {
        // System.out.printf("Olá %s", nome);
        System.out.println("Olá " + nome);
    }
}
