package entidades;

public class AlunoEtevi extends Aluno{

    private int ano;

    public AlunoEtevi(String nomeAluno, int idadeAluno, int ano) {
        super(nomeAluno, idadeAluno);
        this.ano = ano;
    }

    public int getIdade() {
        return ano;
    }

    public void setIdade(int idade) {
        if (idade < 16){
            throw new IllegalArgumentException("Idade inválida");
        }

        this.ano = idade;
    }

    @Override
    public String toString() {
        return "Ano: " + ano +
                "\nNome Aluno: " +super.getNomeAluno() +
                "\nIdade Aluno: " + super.getIdadeAluno();
    }
}
