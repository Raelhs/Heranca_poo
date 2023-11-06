package entidades;

public abstract class Embarcacao {


    private String id;
    private String modelo;
    private int qtdPessoas;
    private double capacidadeCombustivel;
    private double queimaDeCombustivel;
    private int qtdBotesSalvaVidas;

    public Embarcacao(String id, String modelo, int qtdPessoas, double capacidadeCombustivel, double queimaDeCombustivel, int qtdBotesSalvaVidas) {
        setId(id);
        setModelo(modelo);
        setQtdPessoas(qtdPessoas);
        setCapacidadeCombustivel(capacidadeCombustivel);
        setQueimaDeCombustivel(queimaDeCombustivel);
        setQtdBotesSalvaVidas(qtdBotesSalvaVidas);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isBlank() || id.isEmpty()) {
            throw new IllegalArgumentException("Id inválido");
        }
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty() || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido");
        }

        this.modelo = modelo;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        if (qtdPessoas <= 0) {
            throw new IllegalArgumentException("Quantidade de Pessoas Inválida");
        }

        this.qtdPessoas = qtdPessoas;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        if (capacidadeCombustivel <= 0) {
            throw new IllegalArgumentException("Capacidade de combustível inválida");
        }
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getQueimaDeCombustivel() {
        return queimaDeCombustivel;
    }

    public void setQueimaDeCombustivel(double queimaDeCombustivel) {
        if (queimaDeCombustivel <= 0) {
            throw new IllegalArgumentException("Queima de combustível inválida");
        }

        this.queimaDeCombustivel = queimaDeCombustivel;
    }

    public int getQtdBotesSalvaVidas() {
        return qtdBotesSalvaVidas;
    }

    public void setQtdBotesSalvaVidas(int qtdBotesSalvaVidas) {
        if (qtdBotesSalvaVidas < 0) {
            throw new IllegalArgumentException("Quantidade de botes inválida");
        }

        this.qtdBotesSalvaVidas = qtdBotesSalvaVidas;
    }

    public boolean planejarViagem(double distancia) {
        double combustivelNecessario = distancia * queimaDeCombustivel;
        return combustivelNecessario <= capacidadeCombustivel;
    }

    public abstract String verificaSeguranca();


}



