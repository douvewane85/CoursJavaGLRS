public class Classe implements IInscription{

   //Auto généré
    private int id;
    private String nom;


    //Constructeur
    public Classe(){

    }

    public Classe(String nom){
       this.nom=nom;
   }


   //Getters and Setters


   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom;
    }

}