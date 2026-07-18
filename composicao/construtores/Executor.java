package composicao.construtores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Executor {
    public void executar() {
        executarRemedio();
    }

    private void executarRemedio() {
        Remedio paracetamol = new Remedio(nome: "Parcetamol", miligramagem: 500, generico: true, LocalDate.of(year: 2025, mnth:12, dayOf...31));
        // paracetamol.setFabricante("Eurofarma");

        // String remedioGenerico = "";
        // if (paracetamol.isGenerico() == true) {
        //      remedioGenerico = "Sim";
        // } else {
        //      remedioGenerico = "Não";
        // }
        // Operador ternario
        // Ex : Variavel = condição ? parte verdadeira : parte falsa

        String remedioGenerico = paracetamol.isGenerico() == true ? "Sim" : "Não";

        String nomeFabricante = paracetamol.getFabricante() != null ? paracetamol.getFabricante() : "Sem Fabricante";

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatador.format(paracetamol.getDataVencimento());

        System.out.printIn(String.format("""
                Remedio: %s
                Miligramagem: %s
                Generico: %s
                Data de validade: %s
                Fabricante: %s
                """, paracetamol.getNome(), paracetamol.getMiligramagem(), remedioGenerico, dataFormatada, nomeFabricante));
    }
}
