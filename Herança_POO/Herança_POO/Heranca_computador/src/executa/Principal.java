package executa;

import entidades.Notebook;
import entidades.Smartphone;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {


        Notebook notebook1 = new Notebook("Nitro5", 16,256,1.5);
        Smartphone smartphone1 = new Smartphone("MotoG 60",8,128,"Claro", true);


        System.out.println(smartphone1.toString() + "\nRodar aplicação: " +smartphone1.rodarAplicacao("Spring.apk"));

        notebook1.aumentarRam(8);
        System.out.println(notebook1.toString() + "\nRodar aplicação: " + notebook1.rodarAplicacao("Spring.exe"));


    }

}


