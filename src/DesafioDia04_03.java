import java.util.Scanner;

public class DesafioDia04_03 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num1;
        int num2;
        String op;

        System.out.println("digite num1 op num2 > EX.: (  5 * 2  ) ");

        num1 = x.nextInt();
        op = x.next();
        num2 = x.nextInt();

        int somar;
        int subtrair;
        int multiplicar;
        int dividir;

        switch (op) {
            case "+":
                somar = num1 + num2;
                System.out.println(somar);
                break;
            case "-":
                subtrair = num1 - num2;
                System.out.println(subtrair);
                break;
            case "/":
                dividir = num1 / num2;
                System.out.println(dividir);
                break;
            case "*":
                multiplicar = num1 * num2;
                System.out.println(multiplicar);
        }

    }

}
