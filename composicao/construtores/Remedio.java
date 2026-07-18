package construtores;

import java.time.LocalDate;

public class Remedio {
    private String nome; // obrigatorio
    private int miligramagem; // obrigatorio
    private boolean generico; // obrigatorio
    private String LocalDate dataVencimento; // obrigatorio
    private String fabricantes; // opcional

    // Construtores: criar o obketo com informações que sao obrigatorias para o
    // correto funcionamento

    public Remedio(String nome, int miligramagem, boolean generico, localDate dataVencimento) {
        this.nome = nome;
        this.miligramagem = miligramagem;
        this.generico = generico;
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

    // Neste cenario n queremos permitir o usuario alterar o nome
    // public void setNome(string nome) {
    // this.nome = nome;
    // }

    public int getMiligramagem() {
        return miligramagem;
    }

    // neste cenario nao querermos permitir o usuario alterar o miligramagem
    // public void setMiligramagem(int miligrama) {
    // this.miligramagem = miligramagem;
    // }

    public boolean isGenerico() {
        return generico;
    }

    // Neste cenario nao queremos permitir o usuario alterar o generico
    // public void setGenerico(boolean generico) {
    // this. generico = generico;
    // }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    // Neste cenario n queremos permitir o usuario alterar o dataVencimento
    // public void setDataVencimento(LocalDate davaVencimento) {
    // }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
