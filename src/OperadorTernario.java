public class OperadorTernario {
    public static void main(String[] args) {
        int ingresso = 800;
        String acesso = ingresso == 800 ? "VIP" : "PISTA";


        if (ingresso == 800)

            System.out.println("VIP");
        else
            System.out.println("PISTA");
        System.out.println(acesso);
    }

}
