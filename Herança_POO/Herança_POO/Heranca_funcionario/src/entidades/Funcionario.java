package entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {

    private String id;
    private Endereco endereco;
    private LocalDate dataNascimento;
    private String nome;
    private double salario;
    private LocalDate dataIngresso;
    private List<String> listaHabilidades = new ArrayList<>();


    public Funcionario(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario, LocalDate dataIngresso) {
        setId(id);
        setEndereco(endereco);
        setDataNascimento(dataNascimento);
        setNome(nome);
        setSalario(salario);
        setDataIngresso(dataIngresso);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
       if (id == null || id.isBlank() || id.isEmpty()){
           throw new IllegalArgumentException("Id inválido");
       }

        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        if (endereco == null){
            throw new IllegalArgumentException("Endereço inválido");
        }

        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de nascimento Inválida");
        }

        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       if (nome == null || nome.isBlank() || nome.isEmpty()){
           throw new IllegalArgumentException("Nome inválidp");
       }

        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
       if (salario <= 0 ){
           throw new IllegalArgumentException("Salário inválido");
       }
        this.salario = salario;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
       if (dataIngresso.isAfter(LocalDate.now())){
           throw new IllegalArgumentException("Data de ingresso inválida");
       }

        this.dataIngresso = dataIngresso;
    }

    public List<String> getListaHabilidades() {
        return listaHabilidades;
    }

    public void setListaHabilidades(List<String> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }


    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

public double calcularSalarioAnual(){
        return salario *12;
}
public void adicionarHabilidade(String habilidade){
        listaHabilidades.add(habilidade);
}
public int calcularAnosDeEmpresa(){
        return Period.between(dataIngresso, LocalDate.now()).getYears();
}

    @Override
    public String toString() {
        return "<Funcionario>" +
                "Id: " + id +
                "Endereço: " + endereco +
                "Data de Nascimento: " + dataNascimento +
                "Nome: " + nome +
                "Salário: " + salario +
                "Data de Ingresso: " + dataIngresso +
                "Lista de Habilidades: " + listaHabilidades;
    }
}
