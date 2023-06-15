import java.awt.*;
import java.util.Scanner;

public class Dia07_Desafio01 {
    public static void main(String[] args) {
      //minha solucao

        int valueOne;
        int valueTwo;
        int valueThree;

        Scanner value = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        valueOne = value.nextInt();
        System.out.print("Digite o segundo valor: ");
        valueTwo = value.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valueThree = value.nextInt();

        System.out.print("O primeiro valor é: " + valueOne + "\n");
        System.out.print("O segundo valor é: " + valueTwo + "\n");
        System.out.print("O terceiro valor é: " + valueThree+"\n");


        //solucao do professor

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
