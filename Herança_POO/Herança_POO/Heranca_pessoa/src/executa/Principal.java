package executa;

import entidades.Aluno;
import entidades.Endereco;
import entidades.Instrutor;

public class Principal {


    public static void main(String[] args) {

        Instrutor instrutor1 = new Instrutor("Roberto", "(47)9 9999-9999", new Endereco("Brasil", "Santa Catarina", "Blumenau", "Rua", 90), "Roberto@gmail.com", "Kung fu");
        Aluno aluno1 = new Aluno("Emanuel", "(47)9 8888-8888", new Endereco("Brasil", "Santa Catarina", "Blumenau", "Avenida", 246), "Emanuel@gmail.com", "Zika", true);
        Aluno aluno2 = new Aluno("Naudo", "(47)9 6666-6666", new Endereco("Brasil", "Santa Catarina", "Blumenau", "Rua", 567), "Naudo@gmail.com", "Forte", true);

        instrutor1.adicionaAlunos(aluno1);
        instrutor1.adicionaEspecializacao("Motorista de escavadeira");
        instrutor1.adicionaEspecializacao("Mineiro");
        instrutor1.adicionaEspecializacao("Caçador");

        System.out.println("Lista de Especializações: " + instrutor1.getListaEspecializacao());
        System.out.println("\n<Aluno>\n" + aluno1.toString());

        System.out.println("\n<Instrutor> " + instrutor1.toString());

        aluno2.pagar();

        System.out.println("\n" + aluno2.toString());
    }
}


