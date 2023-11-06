package entidades;

public class Cilindro extends Circulo {

    private double altura;

    public Cilindro(String cor, double raio, double altura) {
        super(cor, raio);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
        this.altura = altura;
    }

    public double calcularVolume() {
        return super.calcularArea() * altura;
    }

    @Override
    public String toString() {
        return "A alura do Cilindro é: " + altura +
                "\nO raio do Cilindro é: " + super.getRaio() +
                "\nA cor do Cilindro é: " + super.getCor() +
                "\nO volume do Cilindro é: " + calcularVolume();
    }
}


