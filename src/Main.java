import java.util.Scanner;

import static javafx.scene.input.KeyCode.L;

public class Main {
    public static void main(String[] args) {

        Scanner idade = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");

        byte idadeCliente = idade.nextByte();
        System.out.println("Idade mencionada " + idadeCliente + "anos.");

        int minhaIdade = 30;
        double salarioMensal = 8000.00000014;
        Long salarioMensal1 = 800000000014L;
        Double salarioMensal2 = 3.555;
//        salarioMensal2.toString(1);
        System.out.println(salarioMensal2.toString());
        System.out.println(""+salarioMensal2.toString(1.00000000000001));
        System.out.println("Hello world!");
        System.out.println("minha idade é " + minhaIdade);
        System.out.println("Meu salário é " + salarioMensal);


    }
}