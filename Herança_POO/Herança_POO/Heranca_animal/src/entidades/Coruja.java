package entidades;

public class Coruja extends Animal{


private String corPena;

    public Coruja(String especie, boolean estimacao, double peso, String corPena) {
        super(especie, estimacao, peso);
        setCorPena(corPena);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
       if (corPena == null || corPena.isEmpty() || corPena.isBlank()){
           throw new IllegalArgumentException("Cor inválida");
       }

        this.corPena = corPena;
    }

    @Override
    public String som() {
        return "Pruu";
    }

    @Override
    public String toString() {
        return "\n<Coruja>" +
                super.toString() +
                "Cor das penas: " + getCorPena();
    }
}
