package composicao;

public class Motor {
    private double cilindradas;
    private String combustivel; // Flex, Alcool, Gasolina, Diesel

    public void setCilindradas(double cilindradas){
        this.cilindradas = cilindradas;
    }

    public double getCilindradas(){
        return cilindradas;
    }
    public String getCombustivel(String combustivel){
        return combustivel;
    }
    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }

    @Override
public String toString(){
    return "Motor:\nCilindradas: " + cilindradas + "\nCombustivel: " + combustivel;
}
}
