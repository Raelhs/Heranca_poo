package entidades;

public class Smartphone extends Computador {

    private String operadora;
    private boolean cameraFrontal;

    public Smartphone(String modeloComputador, double ram, double armazenamento, String operadora, boolean cameraFrontal) {
        super(modeloComputador, ram, armazenamento);
        setOperadora(operadora);
        setCameraFrontal(cameraFrontal);
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        if (operadora == null || operadora.isBlank() || operadora.isEmpty()) {
            throw new IllegalArgumentException("Operadora inválida");
        }

        this.operadora = operadora;
    }

    public boolean isCameraFrontal() {
        return cameraFrontal;
    }

    public void setCameraFrontal(boolean cameraFrontal) {
        this.cameraFrontal = cameraFrontal;
    }

    @Override
    public boolean rodarAplicacao(String nomeAplicacao) {
       if (nomeAplicacao.endsWith(".apk")){
           return true;
       }else{
           return false;
       }

    }

    public boolean tirarSelfie() {
        if (cameraFrontal = true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ligar(String operadora) {
        if (operadora.charAt(0) == operadora.charAt(0)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "<Smartphone>" +
                "\nModelo: " +super.getModeloComputador() +
                "\nRam: " + super.getRam() +
                "\nArmazenamento: " + super.getArmazenamento() + "Gb"+
                "\noperadora: " + operadora +
                "\ncameraFrontal: " + cameraFrontal +
                "\nTirar Selfie: " +tirarSelfie() +
                "\nLigar: " + ligar(getOperadora());

    }
}