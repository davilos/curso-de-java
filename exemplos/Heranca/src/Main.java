import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Main mainInstance = new Main();
        mainInstance.criarVendedor();

        Motorista m = new Motorista();
    }

    public void criarVendedor() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Vendedor v = new Vendedor();

        System.out.print("Digite o nome do vendedor: ");
        v.setNome(scanner.nextLine());

        System.out.print("Digite o salário do vendedor: ");
        v.setSalario(scanner.nextFloat());

        System.out.print("Digite o cpf do vendedor: ");
        v.setCpf(scanner.next());

        System.out.print("Digite a data de nascimento do vendedor: ");
        v.setDataNascimento(scanner.next());

        System.out.print("Digite a comissão do vendedor: ");
        v.setComissaoPorItem(scanner.nextFloat());

        System.out.print("Digite o total de itens vendidos do vendedor: ");
        v.setTotalItensVendidos(scanner.nextInt());

        System.out.println("O salário do vendedor é " + v.calcularSalario() + "data: " + v.getDataNascimento());

    }

}