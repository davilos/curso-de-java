import java.text.ParseException;
import java.util.Date;

public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;

    public Vendedor(String nome, String cpf, String dataNascimento, float salario, int totalItensVendidos,
                    float comissaoPorItem) throws ParseException {
        super(nome, cpf, dataNascimento, salario);
        this.totalItensVendidos = totalItensVendidos;
        this.comissaoPorItem = comissaoPorItem;
    }

    @Override
    public float getSalario() {
        return super.getSalario() + (comissaoPorItem * totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
}
