package executa;

import entidades.Cachorro;
import entidades.Coelho;
import entidades.Coruja;
import entidades.Gato;

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Cachorrolis", true, 30.00, "Boxer");
        Gato cat1 = new Gato("Gatolonis", true, 10.00, true);
        Coruja coruja1 = new Coruja("Corujonis", false, 6.00, "Branco");
        Coelho coelho1 = new Coelho("Coelhonis", true, 7.00, "Preto");


        System.out.println(cachorro1.toString());
        System.out.println(cat1.toString());
        System.out.println(coruja1.toString());
        System.out.println(coelho1.toString());


    }
}

