package encapsulamento;

import javax.swing.JOptionPane;

public class imovelExecutor{
    public void executor(){
    Imovel imovelLoriLori = new Imovel();
    imovelLoriLori.getQuantidadeQuadros(quantidadeQuartos:5);
    imovelLoriLori.endereco = "Rua das Mações";
    imovelLoriLori.possuiGaragem = true;
    imovelLoriLori.quantidadeBanheiros = 5;
    imovelLoriLori.metragem = 150;

    JOptionPane.showMessageDialog(null,
    "Imovel" + imovelLoriLori. endereco +
    "\nQuantidade Quartos: " + imovelLoriLori.getQuantidadeQuartos() +
    "\nMetragem: " + imovelLoriLori.metragem +
    "\nQuantidade Banheiro: " + imovelLoriLori.quantidadeBanheiros +
    "\nPossui Garagem: " + imovelLoriLori.possuiGaragem
    );

    } 
}