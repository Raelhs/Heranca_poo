package entidades;

public class Gato_Selvagem extends Animal {

    private String corPelagem;
private String tipoMancha;
    public Gato_Selvagem(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPelagem, String tipoMancha) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
        setTipoMancha(tipoMancha);
        setCorPelagem(corPelagem);
    }


    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        if (corPelagem == null || corPelagem.isEmpty() || corPelagem.isBlank()) {
            throw new IllegalArgumentException("Cor da Pelagem inválido");
        }

        this.corPelagem = corPelagem;
    }

    public String getTipoMancha() {
        return tipoMancha;
    }

    public void setTipoMancha(String tipoMancha) {
        if (tipoMancha == null || tipoMancha.isBlank() || tipoMancha.isEmpty()){
         setTipoMancha("Ausente");
        }
        this.tipoMancha = tipoMancha;
    }

    @Override
    public String toString() {
        return "Nome: " +super.getNomeIdentificacao() +
                "\nRaça: " + super.getRaca() +
                "\nHabitat: " +super.getHabitat() +
                "\nPaís de Origem: " +super.getPaisOrigem() +
                "\nTamanho: " +super.getPorte() +
                "\nCor da Pelagem: " +corPelagem +
                "\nTipo da Mancha: " +tipoMancha;

    }
}
