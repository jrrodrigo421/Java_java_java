import java.util.Scanner;

public class Dia07_Desafio02 {


    public static void main(String[] args) {

        String impar = "N é igual ao um número impar";
        String A = "N é par e está entre 2 e 5";
        String B = "N é par e está entre 6 e 20";
        String C = "N é par e está acima de 20";
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 2 != 0)
            System.out.println(impar);
        if (n >= 2 && n <= 5)
            System.out.println(A);
        if (n >= 6 && n <= 20)
            System.out.println(B);
        if (n > 20)
            System.out.println(C);
        else
            System.out.println("numero 0 ou invalido");

    }
}
