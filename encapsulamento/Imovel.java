package encapsulamento;

/*
encapsulamento: define a visibilidade da parada (atributo/método/construto/classe)
- private (acessivel somente dentro da mesma classe)
- protected (acessivel somente dentro da propria package ou atraves de herença)
- public (acessivel em qualquer lugar)
*/

public class Imovel {
    // Atributos devem ser privados
    private int quantidadeQuartos;
    private int quantidadeBanheiros;
    private int metragem;
    private boolean possuiGaragem;
    private String endereco;

    // SET: metodo que permite definir ou alterar o valor de um atributo
    public void setQuantidadeQuartos(int quantidadeQuartos){
        this.quantidadeQuartos = quantidadeQuartos;
    }

    // GET: metodo que permite obter a informação
    public int getQuantidadeQuartos(){
        return quantidadeQuartos
    }
}
