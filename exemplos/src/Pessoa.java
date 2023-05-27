public class Pessoa {

    // Atributos
    private float peso;
    private float altura;

    // Construtor
    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Método para calcular
    public float calcularIMC() {
        return peso / (altura * altura);
    }

    // Métodos acessores
    public void setPeso(float peso) {
        if (peso <= 0) {
            System.out.println("Peso inválido!");
            System.exit(0);
        }
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        if (altura <= 0) {
            System.out.println("Altura inválida!");
            System.exit(0);
        }
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

}
