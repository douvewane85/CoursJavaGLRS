
public abstract class Personne implements IInscription{

   //Auto généré
    protected int id;
   
    protected  String nomComplet;
    protected  LocalDate dateNaiss;
    protected  int  age;

    public Personne (String nomComplet,
               LocalDate dateNaiss){
      this.nomComplet=nomComplet;
      this.dateNaiss=dateNaiss;
     //Initialisé ID
       this.age=calculAge();

    }

      public Personne (){
        //Initialisé ID
    }

   //Getters and Setters



   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }

   private int calculAge(){
      return 0;
   }

}