package entidades;

public class Notebook extends Computador{

private double peso;

    public Notebook(String modeloComputador, double ram, double armazenamento, double peso) {
        super(modeloComputador, ram, armazenamento);
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("Peso inválido");
        }
        this.peso = peso;
    }

    public void aumentarRam(double quantidade){
           if (this.getRam() > 0 ){
               setRam(getRam()+ quantidade);
           }
        }



    @Override
    public boolean rodarAplicacao(String nomeAplicacao) {
        if (nomeAplicacao.endsWith(".exe")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "\n<Notebook>" +
                "\nModelo: " + super.getModeloComputador() +
                "\nRam: " + super.getRam() +
                "\nArmazenamento: " + super.getArmazenamento() +
                "\npeso: " + peso;
    }
}
