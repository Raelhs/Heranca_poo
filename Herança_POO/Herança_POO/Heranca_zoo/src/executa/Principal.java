package executa;

import entidades.Aves;
import entidades.Gato_Selvagem;
import entidades.Primatas;

public class Principal {

    public static void main(String[] args) {


        Gato_Selvagem cat1 = new Gato_Selvagem("Persa", "GatoNóia" , "Grande" , "Mato" , "Angola", "Preto" , "Listrado");
        Aves ave1 = new Aves("Urubu", "Urubu Do Pix", "Médio" , "Árvore", "Brasil", "Preto", "Picanha", "Azul");
        Primatas primata1 = new Primatas("Bugio" , "BugioDoRuim" , "Grande", "Floresta", "Uruguai","Marrom");

        System.out.println("-----------------------GATO----------------------");
        System.out.println(cat1.toString());

        System.out.println("\n-----------------------AVE----------------------\n");
        System.out.println(ave1.toString());

        System.out.println("\n-----------------------PRIMATA----------------------\n");
        System.out.println(primata1.toString());



    }

}
