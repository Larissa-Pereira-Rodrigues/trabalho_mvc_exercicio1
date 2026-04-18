public class Main {
    public static void main(String[] args) {

        Cliente c = new Cliente("Larissa", "99999");
        Horario h = new Horario("18:00", 100);

        Aluguel aluguel = new Aluguel(c);
        aluguel.adicionarHorario(h);

        AluguelController controller = new AluguelController();
        ConsoleView view = new ConsoleView();

        controller.criarAluguel(aluguel);

        view.mostrarAlugueis(controller.listarAlugueis());
    }
}