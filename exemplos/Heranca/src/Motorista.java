public class Motorista extends Funcionario {

    private String nomeCarro;
    private int totalViagensFeitas;

    public Motorista() {
        super();
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
