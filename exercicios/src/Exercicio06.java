public class Exercicio06 {

    public static void main(String[] args) {
        int A = 0;
        int B = 1;
        int C;

        System.out.printf("Valor de A: %d%nValor de B: %d%n", A, B);

        C = A;
        A = B;
        B = C;

        System.out.println("Valores de A e B trocados!");

        System.out.printf("Valor de A: %d%nValor de B: %d", A, B);

    }
}
