public class Classe implements IInscription{

   //Auto généré
    private int id;
    private String nom;
    //private static int nbreClasse;


    //Constructeur
    public Classe(){

    }

    public Classe(String nom){
       this.nom=nom;
   }


   //Getters and Setters
    public int getId(){
       return id;
    }
    public void setId(int id){
       this.id=id;
    }

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom;
    }

}