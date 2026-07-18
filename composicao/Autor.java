package composicao;

public class Autor {
    private String nome;
    private String cidadeNascimento;

    public Autor() {}

    public Autor(String nome, String cidadeNascimento) {
        this.nome = nome;
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", cidadeNascimento='" + cidadeNascimento + '\'' +
                '}';
    }
}
