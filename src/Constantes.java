public class Constantes {
    public static void main(String[] args) {
        final double jurosFixo = 11.92;
        System.out.println(jurosFixo);
//        jurosFixo = 15.33;

        double numero1 = 1;
        double numero2 = 1;
        double numero3 = 1;
        double numero4 = 4;
        double soma = numero2 + numero1;
        double multiplicacao = numero1 * numero3;
        double subtracao = numero1 - numero4;
        double divisao = numero1 / numero3;
        double divisaoCorreta = (double) numero3 / (double) numero4;
        System.out.println(soma);
        System.out.println(multiplicacao);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(divisaoCorreta);
        numero1++;
        System.out.println(numero1);

        String valorExemplo = "200";
        int valorTotal = Integer.parseInt(valorExemplo) + 2;

        System.out.println(valorTotal);
        String valorNovo = String.valueOf(valorTotal);
        System.out.println(valorNovo + numero1); //concatenou
    }
}
