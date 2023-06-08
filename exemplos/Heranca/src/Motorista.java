import java.text.ParseException;
import java.util.Date;

public class Motorista extends Funcionario {

    private String nomeCarro;
    private int totalViagensFeitas;

    public Motorista(String nome, String cpf, String dataNascimento, float salario, String nomeCarro,
                     int totalViagensFeitas) throws ParseException {
        super(nome, cpf, dataNascimento, salario);
        this.nomeCarro = nomeCarro;
        this.totalViagensFeitas = totalViagensFeitas;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getTotalViagensFeitas() {
        return totalViagensFeitas;
    }

    public void setTotalViagensFeitas(int totalViagensFeitas) {
        this.totalViagensFeitas = totalViagensFeitas;
    }
}
