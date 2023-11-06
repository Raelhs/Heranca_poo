package entidades;

public class Circulo {

private String cor;
private double raio;


    public Circulo(String cor, double raio) {
        setCor(cor);
        setRaio(raio);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
       if (cor == null || cor.isBlank() || cor.isEmpty()){
           throw new IllegalArgumentException("Cor inválida");
        }
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
      if (raio <= 0){
          throw new IllegalArgumentException("Raio inválido");
      }


        this.raio = raio;
    }

public double calcularArea(){
        return Math.PI * (raio * raio);
}


}
