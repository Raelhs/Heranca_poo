package entidades;

public class Coelho extends Animal {


private String pelagem;

    public Coelho(String especie, boolean estimacao, double peso, String pelagem) {
        super(especie, estimacao, peso);
        setPelagem(pelagem);
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
       if (pelagem == null || pelagem.isBlank() || pelagem.isEmpty()){
           throw new IllegalArgumentException("Pelagem inválida");
       }

        this.pelagem = pelagem;
    }

    @Override
    public String som() {
        return "crack";
    }

    @Override
    public String toString() {
        return "\n<Coelho>" +
                super.toString() +
                "\nPelagem: " + getPelagem();
    }
}
