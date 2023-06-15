public class Dia06 {
    //Classes
    public static void main(String[] args) {

        Clients c001 = new Clients();
        c001.firstName = "Rodrigo";
        c001.age = 30;
        Clients c002 = new Clients();
        c002.firstName = "Gleice";
        c002.age = 26;

        System.out.println(c002.age);
        System.out.println(c002.firstName);
        System.out.println(c001.age);
        System.out.println(c001.firstName);

        c001.newAccount();
        c002.newAccount();

        //encapsulamento variavel privada so usa dentro da propria classe   pra poder usar usamos get e set
//        System.out.println(c001.teste);

        Car car = new Car("Punto", "Essence 1.6 Sporting", 2014, 10);

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        car.setMarca("Fiat");
        System.out.println(car.getMarca());
        System.out.println(car.getValorVenda());
//        car.setValorVenda(300.00);
        System.out.println(car.getValorVenda());
        car.setValorVenda(125000, 10);

        System.out.println("O Valor de Venda é R$ " + car.getValorVenda()+"0");
        car.setValorVenda(125000, 20);
        car.setValorVenda(10000, 10);
        System.out.println("O Valor de Venda é R$ " + car.getValorVenda()+"0");
    }
}
