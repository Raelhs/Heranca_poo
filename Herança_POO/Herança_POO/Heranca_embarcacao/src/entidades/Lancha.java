package entidades;

public class Lancha extends Embarcacao {

    private double velmMax;

    public Lancha(String id, String modelo, int qtdPessoas, double capacidadeCombustivel, double queimaDeCombustivel, int qtdBotesSalvaVidas, double velmMax) {
        super(id, modelo, qtdPessoas, capacidadeCombustivel, queimaDeCombustivel, qtdBotesSalvaVidas);
        setVelmMax(velmMax);
    }

    public double getVelmMax() {
        return velmMax;
    }

    public void setVelmMax(double velmMax) {
        if (velmMax <= 20) {
            throw new IllegalArgumentException("Velocidade Máxima inválida");
        }
        this.velmMax = velmMax;
    }

    public double tempoViagem(double distancia) {
        return distancia / velmMax;
    }


    @Override
    public String verificaSeguranca() {
        if (super.getQtdBotesSalvaVidas() >= 1) {
            return "Bote OK!";
        } else {
            return "ALERTA: embracação necessitando de mais botes";
        }
    }

    @Override
    public String toString() {
        return "\n<Lancha>" +
                "\nId: " +super.getId() +
                "\nModelo: " +super.getModelo() +
                "\nQuantidade de pessoas: " +super.getQtdPessoas() +
                "\nCapacidade de Combustível: " +super.getCapacidadeCombustivel() +
                "\nQueima de Combustível: " +super.getQueimaDeCombustivel() +
                "\nQuantidade de Botes Salva Vidas: " +super.getQtdBotesSalvaVidas() +
                "\nVelocidade Máxima: " + velmMax +
                "\nSegurança: " + getQtdBotesSalvaVidas() + " Botes, " + verificaSeguranca();


    }
}
