package composicao;

import java.time.LocalDate;

public class Livro {
    private String nome;
    private String descricao;
    private Autor autor;
    private String isbn;
    private String resumo;
    private LocalDate dataLancamento;

    public Livro() {}

    public Livro(String nome, String descricao, Autor autor, String isbn, String resumo, LocalDate dataLancamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.autor = autor;
        this.isbn = isbn;
        this.resumo = resumo;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", autor=" + autor +
                ", isbn='" + isbn + '\'' +
                ", resumo='" + resumo + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
