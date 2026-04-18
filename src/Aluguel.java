import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    private Cliente cliente;
    private List<Horario> horarios;
    private LocalDate data;

    public Aluguel(Cliente cliente) {
        this.cliente = cliente;
        this.horarios = new ArrayList<>();
        this.data = LocalDate.now();
    }

    public void adicionarHorario(Horario h) {
        if (h.isOcupado()) {
            throw new IllegalArgumentException("Horário já reservado");
        }
        h.ocupar();
        horarios.add(h);
    }

    public double calcularTotal() {
        double total = 0;
        for (Horario h : horarios) {
            total += h.getValor();
        }
        return total;
    }

    public LocalDate getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }
}