import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Larissa", "99999-9999");

        Horario h1 = new Horario("18:00", 100);
        Horario h2 = new Horario("19:00", 100);

        Aluguel aluguel = new Aluguel(c1);

        aluguel.adicionarHorario(h1);
        aluguel.adicionarHorario(h2);

        System.out.println("Cliente: " + c1.getNome());
        System.out.println("Total: R$ " + aluguel.calcularTotal());

        List<Aluguel> alugueis = new ArrayList<>();
        alugueis.add(aluguel);

        System.out.println("\nAlugueis do dia:");
        for (Aluguel a : alugueis) {
            System.out.println("Cliente: " + a.getCliente().getNome());
        }
    }
}