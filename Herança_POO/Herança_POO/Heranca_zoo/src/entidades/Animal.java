package entidades;

public class Animal {

private String raca;
private String nomeIdentificacao;
private String porte;
private String habitat;
private String paisOrigem;


    public Animal(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem) {
        setRaca(raca);
        setNomeIdentificacao(nomeIdentificacao);
        setPorte(porte);
        setHabitat(habitat);
        setPaisOrigem(paisOrigem);
}

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null || raca.isBlank() || raca.isEmpty()){
            throw new IllegalArgumentException("Raça inválida");
        }

        this.raca = raca;
    }

    public String getNomeIdentificacao() {
        return nomeIdentificacao;
    }

    public void setNomeIdentificacao(String nomeIdentificacao) {
       if (nomeIdentificacao == null || nomeIdentificacao.isBlank() || raca.isEmpty()){
           throw new IllegalArgumentException("Nome de Identificação inválida");
       }

        this.nomeIdentificacao = nomeIdentificacao;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        if (porte == null || porte.isBlank() || porte.isEmpty()){
            throw new IllegalArgumentException("Porte inválido");
        }

        this.porte = porte;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isBlank() || habitat.isEmpty()){
            throw new IllegalArgumentException("Habitat inválido");
        }

        this.habitat = habitat;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        if (paisOrigem == null || paisOrigem.isBlank() || paisOrigem.isEmpty()){
            throw new IllegalArgumentException("Pais de origem inválido");
        }

        this.paisOrigem = paisOrigem;
    }

}
