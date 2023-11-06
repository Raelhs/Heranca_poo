package entidades;

public abstract class Computador {

    private String modeloComputador;
    private double ram;
    private double armazenamento;


    public Computador(String modeloComputador, double ram, double armazenamento) {
        setModeloComputador(modeloComputador);
        setRam(ram);
        setArmazenamento(armazenamento);
    }

    public String getModeloComputador() {
        return modeloComputador;
    }

    public void setModeloComputador(String modeloComputador) {
        if (modeloComputador == null || modeloComputador.isBlank() || modeloComputador.isEmpty()) {
            throw new IllegalArgumentException("Modelo Inválido");
        }

        this.modeloComputador = modeloComputador;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        if (ram <= 0) {
            throw new IllegalArgumentException("Ram inválida");
        }
        this.ram = ram;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        if (armazenamento <= 0) {
            throw new IllegalArgumentException("Armazenamento Inválido");
        }

        this.armazenamento = armazenamento;
    }

        public String ligarOuDesligar(boolean ligando){
            if(ligando = true){
                return "Ligando";
            }else {
                return "Desligando";
            }
        }

        public abstract boolean rodarAplicacao(String nomeAplicacao);
}
