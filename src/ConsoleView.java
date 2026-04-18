import java.util.List;

public class ConsoleView {

    public void mostrarAlugueis(List<Aluguel> alugueis) {
        for (Aluguel a : alugueis) {
            System.out.println("Cliente: " + a.getCliente().getNome());
            System.out.println("Total: R$ " + a.calcularTotal());
        }
    }
}