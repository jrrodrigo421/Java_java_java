import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Scanner;

public class FormatacaoNumeros {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double salarioAConverter = salario.nextDouble();
        NumberFormat real = NumberFormat.getCurrencyInstance();
        System.out.println(real.format(salarioAConverter));
    }
}
