import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Funcionario(String nome, String cpf, String dataNascimento, float salario) throws ParseException {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = format.parse(dataNascimento);
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        this.dataNascimento = format.parse(dataNascimento);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
