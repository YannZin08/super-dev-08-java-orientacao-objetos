package composicao;

public class Executor {
    public void executar(){
        executarCarro();
    }

    private void executarCarro(){
        Motor motorPalio = new Motor();
        motorPalio.setCilindradas(cilindradas: 150);
        motorPalio.setCombustivel(combustivel: "Flex");

        Carro palio = new Carro();
        palio.setModelo(modelo:"Pálio com escada");
        palio.setCor(cor: "Vermelho");
        palio.setMotor(motorPalio);
        palio.setEscada(escada: true);

        System.out.printIn(palio.toString());
        System.out.printIn(motorPalio.toString());
    }
}
