public class Pessoa {

    // Atributos
    public float peso;
    public float altura;

    // Construtor
    Pessoa() {

    }

    // Método
    public float calcularIMC() {
        return peso / (altura * altura);
    }
}
