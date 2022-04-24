package ilgg;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date dataInici = new Date( 2022, 4, 15 );
        Date dataFi = new Date( 2022, 4, 25 );

        //profeSubstitut.iniciarSubstitucio(dataInici, dataFi);
        System.out.println(dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear());
        System.out.println(dataFi.getDate() + "/" + dataFi.getMonth() + "/" + dataFi.getYear());

        Institut ins = new Institut();
        ins.canviarNom("La Guineueta");

        String cole = ins.obtenirDades();
        System.out.println(cole);



        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.canviarNom("Manu");
        p2.assignarDni("555555N");

        String dades = p1.obtenirDades();
        String Dni = p2.canviarDni();
        System.out.println(dades + Dni);
        System.out.println(Dni);


        p1.canviarNom("Pepe");

        dades = p1.obtenirDades();
        System.out.println(dades + Dni);

        Estudiant e = new Estudiant();
        e.posarNota(9.9);
        e.canviarNom("Ash");
        dades = e.obtenirDades();
        System.out.println(dades);

    }
}
