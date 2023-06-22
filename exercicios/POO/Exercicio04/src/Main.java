public class Main {
    public static void main(String[] args) {
        Invoice inv = new Invoice(1, "Mousepad", -10, 50.0f);

        System.out.printf("Valor total = R$%.2f", inv.getInvoiceAmount());
    }
}