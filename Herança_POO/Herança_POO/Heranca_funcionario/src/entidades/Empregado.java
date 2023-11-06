package entidades;

import java.time.LocalDate;

public class Empregado extends Funcionario {

    private String idSindicato;
    private Gerente gerente;

    public Empregado(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario, LocalDate dataIngresso, String idSindicato, Gerente gerente) {
        super(id, endereco, dataNascimento, nome, salario, dataIngresso);
        setIdSindicato(idSindicato);
        setGerente(gerente);
    }

    public String getIdSindicato() {
        return idSindicato;
    }

    public void setIdSindicato(String idSindicato) {

        this.idSindicato = idSindicato;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        if (gerente == null) {
            throw new IllegalArgumentException("Gerente Inválido");
        }

        this.gerente = gerente;
    }

    public void sairDoSindicato() {
        setIdSindicato(null);
    }

    public double comissao(double valorComissao) {
        return super.getSalario() + (valorComissao * 0.05);

    }

    @Override
    public String toString() {
        return "<Empregado>" +
                "\nidFuncionário: " + super.getId() +
                "\nEndereço: " + super.getEndereco() +
                "\nData de Nascimento: " + super.getDataNascimento() +
                "\nNome: " + super.getNome() +
                "\nSalário: " + super.getSalario() +
                "\nData de Ingresso: " + super.getDataIngresso() +
                "\nidSindicato: " + idSindicato +
                "\ngerente: " + gerente;
    }
}
