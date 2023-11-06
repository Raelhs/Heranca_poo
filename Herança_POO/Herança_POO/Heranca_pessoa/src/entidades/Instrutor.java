package entidades;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {

    private String especializacao;
    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<String> listaEspecializacao = new ArrayList<>();


    public Instrutor(String nome, String telefone, Endereco endereco, String email, String especializacao) {
        super(nome, telefone, endereco, email);
        setEspecializacao(especializacao);
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        if (especializacao == null || especializacao.isBlank() || especializacao.isEmpty()) {
            throw new IllegalArgumentException("Especialização inválida");
        }

        this.especializacao = especializacao;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<String> getListaEspecializacao() {
        return listaEspecializacao;
    }

    public void setListaEspecializacao(List<String> listaEspecializacao) {
        this.listaEspecializacao = listaEspecializacao;
    }

    public void adicionaAlunos(Aluno al) {
        this.getListaAlunos().add(al);

    }

    public void adicionaEspecializacao(String especializacao) {
        this.getListaEspecializacao().add(especializacao);

    }


    @Override
    public String toString() {
        return  "\nNome: " + super.getNome() +
                "\nTelefone: " + super.getTelefone() +
                "\nEndereço: " + super.getEndereco() +
                "\nEmail: " + super.getEmail() +
                "\nEspecializacao: " + especializacao + "\n" +
                "\n<Alunos deste Instrutor> \n" + getListaAlunos();

    }
}