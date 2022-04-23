package ilgg;

public class Persona {

    public String nom;
    public String dni;

    //Aquesta funcio canvia el nom de la persona
    public void canviarNom(String nom) {
        this.nom = nom;

    }

    public String obtenirDades() {
        return  " Persona que es diu " + this.nom;

    }
}
