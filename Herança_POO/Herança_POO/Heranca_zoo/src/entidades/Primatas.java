package entidades;

public class Primatas extends Animal {

    private String corPelagem;

    public Primatas(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPelagem) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
        setCorPelagem(corPelagem);
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        if (corPelagem == null || corPelagem.isBlank() || corPelagem.isEmpty()) {
            throw new IllegalArgumentException("Cor da pelagem inválido");
        }
        this.corPelagem = corPelagem;
    }

    @Override
    public String toString() {
        return "Nome: " +super.getNomeIdentificacao() +
                "\nRaça: " +super.getRaca() +
                "\nHabitat: " +super.getHabitat() +
                "\nPaís de Origem: " +super.getPaisOrigem() +
                "\nTamanho: " +super.getPorte() +
                "\nCor da Pelagem: " + corPelagem;


    }
}