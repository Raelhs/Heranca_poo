package entidades;

public class Endereco {

private String pais;
private String estado;
private String cidade;
private String logradouro;
private int numero;

    public Endereco(String pais, String estado, String cidade, String logradouro, int numero) {
        setPais(pais);
        setEstado(estado);
        setCidade(cidade);
        setLogradouro(logradouro);
        setNumero(numero);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        if (pais == null || pais.isBlank() || pais.isEmpty()){
            throw new IllegalArgumentException("País inválido");
        }
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
       if (estado == null || estado.isEmpty() || estado.isBlank()){
           throw new IllegalArgumentException("Estado inválido");
        }
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
       if (cidade == null || cidade.isBlank() || cidade.isEmpty()){
           throw new IllegalArgumentException("Cidade inválida");
       }

        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro == null || logradouro.isEmpty() || logradouro .isBlank()){
            throw new IllegalArgumentException("Logradouro inválido");
        }

        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            throw new IllegalArgumentException("Número inválido");
        }

        this.numero = numero;
    }


    @Override
    public String toString() {
        return "\nPaís: " + pais +
                "\nEstado: " + estado +
                "\nCidade: " + cidade +
                "\nLogradouro: " + logradouro +
                "\nNúmero: " + numero;
    }
}
