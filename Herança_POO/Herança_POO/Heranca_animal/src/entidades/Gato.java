package entidades;

public class Gato  extends Animal {

private boolean castrado;

    public Gato(String especie, boolean estimacao, double peso, boolean castrado) {
        super(especie, estimacao, peso);
        setCasrado(castrado);
    }


    public boolean isCastrado() {
        return castrado;
    }

    public void setCasrado(boolean castrado) {
        this.castrado = castrado;
    }

    @Override
    public String som() {
        return "Miau";
    }

    @Override
    public String toString() {
        return "\n<Gato>" +
                super.toString() +
                "\nCastração: " + castrado;
    }
}
