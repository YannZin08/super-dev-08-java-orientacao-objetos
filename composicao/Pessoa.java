package composicao;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private Endereco endereco;

    // Getter e Setter de nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter de cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter e Setter de idade
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter e Setter de endereco
    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

/*  Ex 1 Criar uma classe autor com os seguintes atributos:
-Nome

Criar uma classe Livro com os seguintes atributos:
-nome
- descrição
-autor

Criar função executarLivro no Executor.java que faça:
-criar uma instancia de um livro brasileiro com seu autor
-criar uma instancia de um livro britanico com seu autor
-criar uma instancia de um livro americano com seu autor

- acrescentar na classe autor sua cidade de nascimento
- modificar as instancias dos livros no executor.java para preencher a idade de nascimento
- acrescentar na classe livro: isbn, resumo, daa lancamento (tipo localDate procurar na internet)

apresentar todos os dados de todos os livros e seus autores
*/