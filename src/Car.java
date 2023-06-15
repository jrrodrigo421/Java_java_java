public class Car {
    private String marca;
    private String modelo;
    private int ano;
    private double valorVenda = 125000.00;


    Car(String pmarca, String pmodelo, int pano, double ppppValorDeVenda){
        this.marca = pmarca;
        this.modelo = pmodelo;
        this.ano = pano;
        this.valorVenda = ppppValorDeVenda;


    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public double getValorVenda(){
        return valorVenda;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setValorVenda(double valorVenda, int percentual){
        this.valorVenda = valorVenda + ((valorVenda * percentual) /100);

    }
}
