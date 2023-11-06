package entidades;

public class AlunoFurb extends Aluno {


    private char formalIngresso;
    private String curso;
    private String atletica;


    public AlunoFurb(String nomeAluno, int idadeAluno, char formalIngresso, String curso, String atletica) {
        super(nomeAluno, idadeAluno);
        setFormalIngresso(formalIngresso);
        setCurso(curso);
        setAtletica(atletica);
    }

    public char getFormalIngresso() {
        return formalIngresso;
    }

    public void setFormalIngresso(char formalIngresso) {
        if (formalIngresso == ' ') {
            throw new IllegalArgumentException("Ingresso formal inválido");
        }

        this.formalIngresso = formalIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {

        this.curso = curso;
    }

    public String getAtletica() {
        return atletica;
    }

    public void setAtletica(String atletica) {
        if (atletica == null || atletica.isEmpty() || atletica.isBlank()) {
            throw new IllegalArgumentException("Atletica inválida");
        }

        this.atletica = atletica;
    }


    public void trancarCurso() {
        setCurso(null);
    }

    @Override
    public String toString() {
        return "Ingresso: " +formalIngresso +
                "\nCurso: " + curso +
                "\nAtletica: " + atletica +
                "\nNome do Aluno: " + super.getNomeAluno() +
                "\nIdade do Aluno: " + super.getIdadeAluno();
    }
}
