package encapsulamento;

import javax.swing.JOptionPane;

public class ImovelExecutor {

    public void executar() {

        Imovel imovelLoriLori = new Imovel();

        imovelLoriLori.setQuantidadeQuartos(5);
        imovelLoriLori.setQuantidadeBanheiros(5);
        imovelLoriLori.setMetragem(150);
        imovelLoriLori.setPossuiGaragem(true);
        imovelLoriLori.setEndereco("Rua das Maçãs");

        JOptionPane.showMessageDialog(
                null,
                "Endereço: " + imovelLoriLori.getEndereco() +
                        "\nQuantidade de Quartos: " + imovelLoriLori.getQuantidadeQuartos() +
                        "\nQuantidade de Banheiros: " + imovelLoriLori.getQuantidadeBanheiros() +
                        "\nMetragem: " + imovelLoriLori.getMetragem() + " m²" +
                        "\nPossui Garagem: " + imovelLoriLori.isPossuiGaragem());
    }
}