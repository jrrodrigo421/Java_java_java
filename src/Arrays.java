public class Arrays {
    public static void main(String[] args) {
//        int[] valores ={10,15,30,45};
//        java.util.Arrays.sort(valores);
//        System.out.println(java.util.Arrays.toString(valores));
//        System.out.println(valores.length);

        String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
        System.out.println(java.util.Arrays.toString(cars));
        System.out.println(java.util.Arrays.toString(cars));
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        cars[0] = "PUNTO";
        System.out.println(cars[0]);
        System.out.println(java.util.Arrays.toString(cars));

        String [][] arrayMultidimensional = {{"BMW", "Punto"},{"Celta", "SantaFé"}};
//        System.out.println(arrayMultidimensional);
        System.out.println(java.util.Arrays.toString(arrayMultidimensional[1]));
        System.out.println(java.util.Arrays.toString(arrayMultidimensional));
//        System.out.println(arrayMultidimensional[1]);
        System.out.println(java.util.Arrays.deepToString(arrayMultidimensional));


    }
}
