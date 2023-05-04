import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MeuPrimeiroPrograma {

    public static void main(String[] args) {
        // String[] -> Lista de strings
        // 0 -> Nome, 1 -> Altura, 2 -> Peso | java MeuPrimeiroPrograma Nome Altura Peso

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US); // Define a localização para os EUA
        DecimalFormat df = (DecimalFormat)nf; // Define o formato decimal para os EUA
        df.setMaximumFractionDigits(2); // Define o número máximo para duas casas decimais

        // Começando o projeto

        System.out.println("Ola, " + args[0] + " vamos calcular seu IMC!");

        double altura = Double.parseDouble(args[1]); // Recebe, e converte a altura do usuário para número real
        double peso = Double.parseDouble(args[2]); // Recebe, e converte o peso do usuário para número real

        double calc_imc = peso / Math.pow(altura, 2); // Faz o cálculo do imc
        String format_imc = df.format(calc_imc); // Formata o número para dois dígitos decimais
        double imc = Double.parseDouble(format_imc); // Recebe, e converte cálculo formatado para número real

        // Condições
        if (imc < 16.0) {
            System.out.println("Magreza Grau III");
        }
        else if (imc >= 16.0 && imc <= 16.9) {
            System.out.println("Magreza Grau II");
        }
        else if (imc >= 17.0 && imc <= 18.4) {
            System.out.println("Magreza Grau I");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Adequado");
        }
        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Pré-obeso");
        }
        else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        }
        else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        }
        else {
            System.out.println("Obesidade Grau III");
        }
    }
}
