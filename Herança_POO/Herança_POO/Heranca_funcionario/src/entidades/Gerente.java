package entidades;

import java.time.LocalDate;

public class Gerente extends Funcionario {

    private String idGerente;

    public Gerente(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario, LocalDate dataIngresso, String idGerente) {
        super(id, endereco, dataNascimento, nome, salario, dataIngresso);
        setIdGerente(idGerente);
    }

    public String getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(String idGerente) {
        if (idGerente == null || idGerente.isBlank() || idGerente.isEmpty()) {
            throw new IllegalArgumentException("Id do gerente inválido");
        }
        this.idGerente = idGerente;
    }

    public void demitirEmpregado(Empregado empregado) {
        if (this.equals(empregado.getGerente())) {
            empregado.setId("DEMITIDO");
        } else {
            throw new IllegalArgumentException("Este Funcionário não é deste Grerente!");
        }
    }

    @Override
    public String toString() {
        return "<\nGerente>" +
                "\nidGerente: " + idGerente +
                "\nidFuncionário: " + super.getId() +
                "\nEndereço: " + super.getEndereco() +
                "\nData de Nascimento: " + super.getDataNascimento() +
                "\nNome: " + super.getNome() +
                "\nSalário: " + super.getSalario() +
                "\nData de Ingresso: " + super.getDataIngresso();

    }
}
