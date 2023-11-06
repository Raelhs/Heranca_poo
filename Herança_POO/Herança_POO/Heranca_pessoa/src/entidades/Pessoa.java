package entidades;

public abstract class Pessoa {

private String nome;
private String telefone;

private Endereco endereco;
private String email;


    public Pessoa(String nome, String telefone, Endereco endereco, String email) {
        setNome(nome);
        setTelefone(telefone);
        setEndereco(endereco);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank() || nome.isEmpty()){
            throw new IllegalArgumentException("Nome inválido");
        }

        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isBlank() || telefone.isEmpty()){
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty() || email.isBlank()){
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }
}
