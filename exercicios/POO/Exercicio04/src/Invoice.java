public class Invoice {

    private int codigoItem;
    private String descricaoItem;
    private int quantidadeItem;
    private float precoUnitarioItem;

    public Invoice(int codigoItem, String descricaoItem, int quantidadeItem, float precoUnitarioItem) {
        this.codigoItem = codigoItem;
        this.descricaoItem = descricaoItem;
        // Math.max() -> Retorna o maior valor entre dois inteiros.
        this.setQuantidadeItem(quantidadeItem);
        this.setPrecoUnitarioItem(precoUnitarioItem);
    }

    public double getInvoiceAmount() {
        return this.quantidadeItem * this.precoUnitarioItem;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = Math.max(quantidadeItem, 0);;
    }

    public float getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(float precoUnitarioItem) {
        this.precoUnitarioItem = Math.max(precoUnitarioItem, 0);;
    }
}