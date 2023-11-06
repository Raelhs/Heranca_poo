package entidades;

public class Aluno {

    private String nomeAluno;
    private int idadeAluno;


    public Aluno(String nomeAluno, int idadeAluno) {
        setNomeAluno(nomeAluno);
        setIdadeAluno(idadeAluno);
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        if (nomeAluno == null || nomeAluno.isBlank() || nomeAluno.isEmpty()){
            throw new IllegalArgumentException("Nome do Aluno inválido");
        }

        this.nomeAluno = nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
       if (idadeAluno <  16){
           throw new IllegalArgumentException("Idade inválida");
       }

        this.idadeAluno = idadeAluno;
    }
}

