public class Classe implements IInscription{

   //Auto généré
    private int id;
    private String nom;

   //Getters and Setters

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom;
    }

}