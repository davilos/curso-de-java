import java.util.Scanner;

public class Exercicio04 {
    static String nomeVendedor;
    static float salarioFixoVendedor;
    static float totalVendasVendedor;
    static float salarioFinalVendedor;

    public static void main(String[] args) {
        cadastrarVendedor();

        System.out.printf("%nNome: %s%nSalário fixo: R$%.2f%nSalário final: R$%.2f", nomeVendedor,
                salarioFixoVendedor, salarioFinalVendedor);
    }

    public static void cadastrarVendedor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        nomeVendedor = scanner.nextLine();

        System.out.print("Salário fixo: R$");
        salarioFixoVendedor = scanner.nextFloat();

        System.out.print("Total de vendas (mês) : R$");
        totalVendasVendedor = scanner.nextFloat();

        calcularSalarioFinal();
    }

    public static void calcularSalarioFinal() {
        salarioFinalVendedor = salarioFixoVendedor + ((totalVendasVendedor * 15) / 100);
    }

}
