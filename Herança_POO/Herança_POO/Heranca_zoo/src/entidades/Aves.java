package entidades;

public class Aves extends Animal {

    private String corPena;
    private String tipoAlimentacao;
    private String corPredominante;

    public Aves(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPena, String tipoAlimentacao, String corPredominante) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
        setCorPredominante(corPredominante);
        setCorPena(corPena);
        setTipoAlimentacao(tipoAlimentacao);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        if (corPena == null || corPena.isBlank() || corPena.isEmpty()) {
            throw new IllegalArgumentException("Cor da Pena Inválida");
        }
        this.corPena = corPena;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        if (tipoAlimentacao == null || tipoAlimentacao.isBlank() || tipoAlimentacao.isEmpty()) {
            throw new IllegalArgumentException("Tipo de Alimentação inválido");
        }

        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(String corPredominante) {
        if (corPredominante == null || corPredominante.isBlank()|| corPredominante.isEmpty()){
            throw new IllegalArgumentException("Cor predominante inválido");
        }
        this.corPredominante = corPredominante;
    }

    @Override
    public String toString() {
        return "Nome da Ave: " +super.getNomeIdentificacao() +
                "\nRaça: " +super.getRaca() +
                "\nHabitat: " +super.getHabitat() +
                "\nPaís de Origem: " +super.getPaisOrigem() +
                "\nTamanho: " +super.getPorte() +
                "\nCor pena: " +corPena +
                "\nTipo Alimentação: " + tipoAlimentacao+
                "\nCor Predominante: " +corPredominante;
    }
}
