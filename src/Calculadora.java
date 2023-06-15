import java.math.BigDecimal;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner numeroDigitado = new Scanner(System.in);
//        Scanner numeroDigitado2 = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
//        BigDecimal numero1 = numeroDigitado.nextBigDecimal();
        double numero1 = numeroDigitado.nextDouble();

        System.out.print("Digite o segundo numero: ");
//        BigDecimal numero2 = numeroDigitado.nextBigDecimal();
        double numero2 = numeroDigitado.nextDouble();
//        BigDecimal soma = numero1.add(numero2);
        double soma= numero1 + numero2;
        System.out.println("A soma dos dois numeros digitados foi: " + soma);
        System.out.println("#################");
        System.out.println("        FIM");
        System.out.println("#################");
    }

}
