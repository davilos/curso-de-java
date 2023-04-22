public class MeuPrimeiroProgama {

    // Ponto de entrada/Entry-point -> É o ponto onde todos os sistemas procuram no projeto
    // para começar a inicialização dele. Nele, podemos armazenar propriedades e variáveis.

    // Propriedades/variáveis -> Será onde iremos armazenar dados para manipulá-los no futuro.
    public static void main(String[] args) {
        System.out.println(2 + 2); // Imprime um cálculo de soma de 2 + 2
        System.out.println(2 + 6); // Imprime um cálculo de soma de 2 + 6
        System.out.println("Texto"); // Imprime "Texto" na tela

        // Ativa/executa o método "minhaInstrucaoDeImprimir" e "calcular_divisao"
        minhaInstrucaoDeImprimir();

        calcular_divisao();
    }

    // Métodos/Funções: São instruções definidas para o programa executar
    static void minhaInstrucaoDeImprimir() {
        System.out.println("Olá, mundo!. Eu sou o primeiro programa do Dávilos em Java!!!");
    }

    static void calcular_divisao() {
        System.out.println(10 / 3); // Imprime um cálculo de divisão (não exata) de 10 / 3
    }
}
