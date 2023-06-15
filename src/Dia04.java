import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Dia04 {

    //switch

    public static void main(String[] args) {
        System.out.println("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String produto = s.next().toLowerCase();

        switch (produto) {
            case "banana":
                System.out.println("R$9,50");
                break;

            case "maca":
                System.out.println("R$10,00");
                break;
            case "laranja":
                System.out.println("R$5,00");

        }
//          For
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            System.out.println("Rodrigo");
        }

//      for em array
        String[] cars = {"BMW", "Telas", "Fiat"};

        for (int i = 0; i < cars.length; i++) {
            System.out.print(i + " ");
            System.out.println(cars[i]);
        }

//      for em matriz nested for


        for (int k = 0; k < 2; k++)
            for (int j = 0; j < 2; j++)
                for (int d = 0; d < 2; d++)
                    for (int e = 0; e < 2; e++)
                        System.out.println(k + " " + j + " " + d + " " + e);
        // while loop

        int r = 0;
        while (r <= 5){
            System.out.println(r);
            r++;
        }







    }
}
