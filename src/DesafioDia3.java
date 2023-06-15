import java.util.Scanner;

public class DesafioDia3 {
    public static void main(String[] args) {
        Scanner numeroAInserir = new Scanner(System.in);
        System.out.println("Digite um nunmero: ");
        String numeroASerVerificado = numeroAInserir.next();
//        System.out.println(numeroASerVerificado);
        System.out.println(numeroASerVerificado.length());

        Scanner numeroAInserir2 = new Scanner(System.in);
        System.out.println("Insira o segundo numero : ");
        int numeroASerVerificado2 = numeroAInserir2.nextInt();
        if (numeroASerVerificado2 >= 0 && numeroASerVerificado2 < 9)
            System.out.println("Numero com apenas 1 digito");
        if (numeroASerVerificado2 >= 10 && numeroASerVerificado2 < 99)
            System.out.println("Numero com apenas 2 digitos");
        if (numeroASerVerificado2 >= 100 && numeroASerVerificado2 < 999)
            System.out.println("Numero com 3 digitos");
        if (numeroASerVerificado2 >= 1000 && numeroASerVerificado2 < 9999)
            System.out.println("Numero com 4 digitos");
        if (numeroASerVerificado2 >= 10000)
            System.out.println("Numero com 5 digitos ou mais");
    }
}
