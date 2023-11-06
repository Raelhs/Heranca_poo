package executa;

import entidades.Lancha;
import entidades.Transatlantico;

public class Principal {

    public static void main(String[] args) {


        Transatlantico transatlantico1 = new Transatlantico("R58888","Titanic",80,800000,10000,75,1980,90);
        Lancha lancha1 = new Lancha("J666","De pesca", 4,100000,4000,3,90);


        transatlantico1.adicionarBotes(5);
        System.out.println(transatlantico1.toString() + "\nPlanejar viagem: " +transatlantico1.planejarViagem(700));

        lancha1.setQtdBotesSalvaVidas(0);
        System.out.println(lancha1.toString() +"\nTempo de viagem: " + lancha1.tempoViagem(500) + "\nPlanejar Viagem: " + lancha1.planejarViagem(10));



    }




}
