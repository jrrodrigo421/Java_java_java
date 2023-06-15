public class ComparacaoNumeros {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a >= b);
//        System.out.println(a <= b);

        boolean teste = a > 1 || b <10;
        boolean teste2 = a > 1 && b <10;
        boolean teste3 = a < 1 || b > 10;
        boolean teste4 = a < 1 && b > 10;
        System.out.println(teste);
        System.out.println(teste2);
        System.out.println(teste3);
        System.out.println(teste4);
    }
}
