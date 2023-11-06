package executa;

import entidades.Aluno;
import entidades.AlunoEtevi;
import entidades.AlunoFurb;

public class Principal {

    public static void main(String[] args) {

        AlunoEtevi al1 = new AlunoEtevi("Emanuel", 18, 2010);
        AlunoFurb alunoFurb1 = new AlunoFurb("Naudo",20,'V', "ADS","CV");

        alunoFurb1.trancarCurso();
        System.out.println(alunoFurb1.toString());

        System.out.println("\nAluno Etevi: \n");
        System.out.println(al1.toString());


    }

}
