package entidades;

public class Aluno extends Pessoa {

    private String tipoDeAssociacao;
    private boolean pagamentoEmAtraso;


    public Aluno(String nome, String telefone, Endereco endereco, String email, String tipoDeAssociacao, boolean pagamentoEmAtraso) {
        super(nome, telefone, endereco, email);
        setTipoDeAssociacao(tipoDeAssociacao);
        setPagamentoEmAtraso(pagamentoEmAtraso);
    }

    public String getTipoDeAssociacao() {
        return tipoDeAssociacao;
    }

    public void setTipoDeAssociacao(String tipoDeAssociacao) {
        if (tipoDeAssociacao == null || tipoDeAssociacao.isEmpty() || tipoDeAssociacao.isBlank()) {
            throw new IllegalArgumentException("Associacao inválida");
        }

        this.tipoDeAssociacao = tipoDeAssociacao;
    }

    public boolean isPagamentoEmAtraso() {
        return pagamentoEmAtraso;
    }

    public void setPagamentoEmAtraso(boolean pagamentoEmAtraso) {
        this.pagamentoEmAtraso = pagamentoEmAtraso;
    }

    public void pagar() {
        setPagamentoEmAtraso(false);
    }

    @Override
    public String toString() {
        return "Nome do Aluno: " + super.getNome() +
                "\nTelefone: " + super.getTelefone() +
                "\nEndereço: " + super.getEndereco() +
                "\nEmail: " + super.getEmail() +
                "\nTipo de Associação : " + tipoDeAssociacao +
                "\nPagamento: " + pagamentoEmAtraso;
    }
}
