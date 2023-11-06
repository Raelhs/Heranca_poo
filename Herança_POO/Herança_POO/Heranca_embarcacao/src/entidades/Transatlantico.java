package entidades;

public class Transatlantico extends Embarcacao {

    private int anoBatismo;
    private int capacidadeBoteSalvaVidas;


    public Transatlantico(String id, String modelo, int qtdPessoas, double capacidadeCombustivel, double queimaDeCombustivel, int qtdBotesSalvaVidas, int anoBatismo, int capacidadeBoteSalvaVidas) {
        super(id, modelo, qtdPessoas, capacidadeCombustivel, queimaDeCombustivel, qtdBotesSalvaVidas);
        setAnoBatismo(anoBatismo);
        setCapacidadeBoteSalvaVidas(capacidadeBoteSalvaVidas);
    }


    public int getAnoBatismo() {
        return anoBatismo;
    }

    public void setAnoBatismo(int anoBatismo) {
        if (anoBatismo < 1900) {
            throw new IllegalArgumentException("Ano de batismo inválido");
        }

        this.anoBatismo = anoBatismo;
    }

    public int getCapacidadeBoteSalvaVidas() {
        return capacidadeBoteSalvaVidas;
    }

    public void setCapacidadeBoteSalvaVidas(int capacidadeBoteSalvaVidas) {
        if (capacidadeBoteSalvaVidas < 0) {
            throw new IllegalArgumentException("Capacidade de botes salva vidas inválido");
        }
        this.capacidadeBoteSalvaVidas = capacidadeBoteSalvaVidas;
    }

    @Override
    public String verificaSeguranca() {
        if (super.getQtdBotesSalvaVidas() >= super.getQtdPessoas()) {
            return "Botes OK";
        } else {
            return "ALERTA: embarcação necessitando de mais botes!";
        }
    }

    public void adicionarBotes(int qtBotes) {
        if (qtBotes > 0) {
            super.setQtdBotesSalvaVidas(super.getQtdBotesSalvaVidas()+ qtBotes);
        }

    }

    @Override
    public String toString() {
        return "<Transatlantico>" +
                "\nId: " +super.getId() +
                "\nModelo" +super.getModelo() +
                "\nQuantidade de pessoas: " +super.getQtdPessoas() +
                "\nCapacidade de Combustível: " +super.getCapacidadeCombustivel() +
                "\nQueima de Combustível" +super.getQueimaDeCombustivel() +
                "\nQuantidade de Botes Salva Vidas" +super.getQtdBotesSalvaVidas() +
                "\nAno Batismo: " + anoBatismo +
                "\nCapacidade De Botes Salva Vidas: " + capacidadeBoteSalvaVidas +
                "\nSegurança: " + getQtdBotesSalvaVidas() + " Botes, " + verificaSeguranca();

    }
}



