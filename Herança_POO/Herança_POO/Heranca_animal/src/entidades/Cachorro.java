package entidades;

public class Cachorro extends Animal{

private  String raca;


    public Cachorro(String especie, boolean estimacao, double peso, String raca) {
        super(especie, estimacao, peso);
        setRaca(raca);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
       if (raca == null || raca.isEmpty() || raca.isBlank()){
           throw new IllegalArgumentException("Raça Inválida");
       }
        this.raca = raca;
    }

    @Override
    public String som() {
        return "AUAUAUAUUA";
    }


    @Override
    public String toString() {
        return "<Cachorro>" +
                super.toString() +
                "\nRaça: " + getRaca();
    }
}
