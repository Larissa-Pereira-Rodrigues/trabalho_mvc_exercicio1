public class Horario {
    private String hora;
    private double valor;
    private boolean ocupado;

    public Horario(String hora, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.hora = hora;
        this.valor = valor;
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() {
        if (ocupado) {
            throw new IllegalArgumentException("Horário já ocupado");
        }
        ocupado = true;
    }

    public double getValor() {
        return valor;
    }

    public String getHora() {
        return hora;
    }
}