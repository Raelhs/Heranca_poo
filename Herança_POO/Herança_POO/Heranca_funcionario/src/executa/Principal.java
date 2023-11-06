package executa;

import entidades.Empregado;
import entidades.Endereco;
import entidades.Gerente;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("Cv123", new Endereco("Iraque", "Bagdá", "Homônima", "Avenida", 87887), LocalDate.of(2002, 12, 16), "Abdul Hadid", 10000, LocalDate.of(2022, 2, 14), "Met12", new Gerente("RA444", new Endereco("Brasil", "Santa Catarina", "Blumenau", "Rua", 666), LocalDate.of(1979, 9, 9), "Roberto", 12000, LocalDate.of(2000, 5, 23), "ger1"));
        Gerente gerente1 = new Gerente("Cv987", new Endereco("Brasil", "Santa Catarina", "Blumenau", "Rua", 1010), LocalDate.of(1980, 4, 18), "Jorge", 20000, LocalDate.of(2001, 11, 12), "ger2");
        empregado1.getGerente().demitirEmpregado(empregado1);
        System.out.println(empregado1.toString());


        empregado1.adicionarHabilidade("Voar");
        empregado1.adicionarHabilidade("Ficar Invisível");

        System.out.println("\nLista de Habilidades" + empregado1.getListaHabilidades());

        System.out.println("\nIdade: " + empregado1.getIdade());
        System.out.println("\nSalário Anual: " + empregado1.calcularSalarioAnual());

        System.out.println("\nAnos de Empresa: " + empregado1.calcularAnosDeEmpresa());

        System.out.println("Comissão: " + empregado1.comissao(800));

        empregado1.sairDoSindicato();
        System.out.println("\nSair do Sindicato: " + empregado1.getIdSindicato());

        gerente1.demitirEmpregado(empregado1);

    }

}
