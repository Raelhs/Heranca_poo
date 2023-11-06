package entidades;

public abstract class Animal {

    private String especie;
    private boolean estimacao;
    private double peso;

    public Animal(String especie, boolean estimacao, double peso) {
        setEspecie(especie);
        setEstimacao(estimacao);
        setPeso(peso);

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank() || especie.isEmpty()) {
            throw new IllegalArgumentException("Espécie Inválida");
        }
        this.especie = especie;
    }

    public boolean isEstimacao() {
        return estimacao;
    }

    public void setEstimacao(boolean estimacao) {
        this.estimacao = estimacao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nEspécie: " + especie +
                "\nEstimação: " + estimacao +
                "\nPeso: " + peso;
    }

    public abstract String som();

}
