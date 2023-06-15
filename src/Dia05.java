public class Dia05 {
    public static void main(String[] args) {
        productList("Laranja");
        productList("abacate");
        productList("abacate", 10.25);
        productList("abacate", 10.31);

        //testando tipos de variaveis:

        Double x = 13.0;
        double y = 15000.0;
        System.out.println(x);
        System.out.println(y);

        System.out.println("metodo byteValue do Double");
        System.out.println(x.byteValue());
        System.out.println("acima");

        String var = "x";
//        string var = "y";

        int z = 1;
        Integer r = 2;

        System.out.println(z);
        System.out.println(r);

        System.out.println("listar numeros de 0 a 20:");
        eveNumbers(20);
    }



    // criando metodos
    public static void productList(String productName){
        System.out.println(productName);
    }
    //sobrescrevendo os metodos
    public static void productList(String productName, double productValue){
        System.out.println("O Produto é "+productName);
        System.out.println("com valor: "+productValue);
    }

    //Debuggando

    public static void eveNumbers(int numbers){
        for (int i = 6; i <= numbers; i++){
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
