import java.util.ArrayList;
import java.util.List;

public class AluguelController {

    private List<Aluguel> alugueis = new ArrayList<>();

    public void criarAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public List<Aluguel> listarAlugueis() {
        return alugueis;
    }
}