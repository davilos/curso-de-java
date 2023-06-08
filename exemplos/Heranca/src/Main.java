import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Main mainInstance = new Main();
        mainInstance.criarVendedor();

        Motorista m = new Motorista("Pedro", "123123123", "20/05/2000", 1500.0f,
                "Gol", 15);
    }

    public void criarVendedor() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cpf do vendedor: ");
        String cpf = scanner.next();

        System.out.print("Digite a data de nascimento do vendedor: ");
        String dataNascimento = scanner.next();

        System.out.print("Digite o salário do vendedor: ");
        float salario = scanner.nextFloat();

        System.out.print("Digite o total de itens vendidos do vendedor: ");
        int totalItens = scanner.nextInt();

        System.out.print("Digite a comissão do vendedor: ");
        float comissao = scanner.nextFloat();

        Vendedor v = new Vendedor(nome, cpf, dataNascimento, salario, totalItens, comissao);

        System.out.println("O salário do vendedor é " + v.getSalario() + "\ndata: " + v.getDataNascimento());
    }

}