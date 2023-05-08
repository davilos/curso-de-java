import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MeuPrimeiroPrograma {
    public MeuPrimeiroPrograma() {
    }

    public static void main(String[] var0) {
        NumberFormat var1 = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat var2 = (DecimalFormat)var1;
        var2.setMaximumFractionDigits(2);
        System.out.println("Ola, " + var0[0] + " vamos calcular seu IMC!");
        double var3 = Double.parseDouble(var0[1]);
        double var5 = Double.parseDouble(var0[2]);
        double var7 = var5 / Math.pow(var3, 2.0);
        String var9 = var2.format(var7);
        double var10 = Double.parseDouble(var9);
        if (var10 < 16.0) {
            System.out.println("Magreza Grau III");
        } else if (var10 >= 16.0 && var10 <= 16.99) {
            System.out.println("Magreza Grau II");
        } else if (var10 >= 17.0 && var10 <= 18.49) {
            System.out.println("Magreza Grau I");
        } else if (var10 >= 18.5 && var10 <= 24.99) {
            System.out.println("Adequado");
        } else if (var10 >= 25.0 && var10 <= 29.99) {
            System.out.print("Pre-obeso");
        } else if (var10 >= 30.0 && var10 <= 34.99) {
            System.out.println("Obesidade Grau I");
        } else if (var10 >= 35.0 && var10 <= 39.99) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }

    }
}
