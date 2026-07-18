package composicao;

import java.time.LocalDate;

public class Executor {
    public void executar(){
        executarCarro();
        executarLivro();
    }

    private void executarCarro(){
        Motor motorPalio = new Motor();
        motorPalio.setCilindradas(150);
        motorPalio.setCombustivel("Flex");

        Carro palio = new Carro();
        palio.setModelo("Pálio com escada");
        palio.setCor("Vermelho");
        palio.setMotor(motorPalio);
        palio.setEscada(true);

        System.out.println(palio.toString());
        System.out.println(motorPalio.toString());
    }

    public void executarLivro() {
        // Livro Brasileiro
        Autor autorBR = new Autor("Machado de Assis", "Rio de Janeiro");
        Livro livroBR = new Livro(
            "Dom Casmurro", 
            "Clássico do Realismo Brasileiro", 
            autorBR, 
            "978-85-01-01234-5", 
            "A história de Bentinho e Capitu.", 
            LocalDate.of(1899, 1, 1)
        );

        // Livro Britânico
        Autor autorUK = new Autor("J.K. Rowling", "Yate");
        Livro livroUK = new Livro(
            "Harry Potter e a Pedra Filosofal", 
            "Fantasia infanto-juvenil", 
            autorUK, 
            "978-0747532699", 
            "O início da jornada do jovem bruxo.", 
            LocalDate.of(1997, 6, 26)
        );

        // Livro Americano
        Autor autorUS = new Autor("Stephen King", "Portland");
        Livro livroUS = new Livro(
            "O Iluminado", 
            "Terror psicológico", 
            autorUS, 
            "978-85-325-0714-3", 
            "Um escritor se torna zelador de um hotel isolado.", 
            LocalDate.of(1977, 1, 28)
        );

        System.out.println("--- Dados dos Livros ---");
        System.out.println(livroBR);
        System.out.println(livroUK);
        System.out.println(livroUS);
    }
}
