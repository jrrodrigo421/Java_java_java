import java.util.Arrays;

public class DesafioDia2 {
    public static void main(String[] args) {
        int[] array1 = {
            1785, 1990, 2001,
                2002, 2010, 1993,
                1911, 1850, 2023};
        String[] array2 = {
                "Java",
                "Python",
                "JavaScript",
                "Linux"
        };
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);

        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array2));
    }

}
