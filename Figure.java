
public abstract class Figure{

   //attributs
          //instance
            protected double  longeur;
          //Classe 
            protected static String unite;  

   //Methodes
    //Intances
     //Constructeur :est une methode qui porte le meme nom que la classe et n'a pas de type      //de retour 
       //Constructeur par défaut
       public Figure(){
      }
   //Getters et Setters=> toujours methodes concretes, methodes  Intances ou  methodes     //Classe 
     //Getters et Setters de longueur
      public double getLongeur(){
          return this.longueur;
     }

     public void setLongeur(double longueur){
            this.longueur=longueur;
     }

  //Getters et Setters de unite
      public static String getUnite(){
          return unite;
     }

     public static void setUnite(String unite){
            Figure.unite=unite;
     }
   
   //metiers 
     public abstract double demiPerimetre() ;    
      
    public double perimetre() {
         demiPerimetre()*2;
   }  

   public abstract double surface() ; 
   public abstract double diagonale();   

      

}