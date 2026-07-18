package encapsulamento;

/*
Encapsulamento: define a visibilidade dos atributos e métodos.
- private: acessível somente dentro da própria classe.
- protected: acessível na própria classe, no pacote e por herança.
- public: acessível em qualquer lugar.
*/

public class Imovel {

    // Atributos privados
    private int quantidadeQuartos;
    private int quantidadeBanheiros;
    private int metragem;
    private boolean possuiGaragem;
    private String endereco;

    public void setQuantidadeQuartos(int quantidadeQuartos) {
        this.quantidadeQuartos = quantidadeQuartos;
    }
    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }
    public void setQuantidadeBanheiros(int quantidadeBanheiros) {
        this.quantidadeBanheiros = quantidadeBanheiros;
    }
    public int getQuantidadeBanheiros() {
        return quantidadeBanheiros;
    }
    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }
    public int getMetragem() {
        return metragem;
    }
    public void setPossuiGaragem(boolean possuiGaragem) {
        this.possuiGaragem = possuiGaragem;
    }
    public boolean isPossuiGaragem() {
        return possuiGaragem;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
}