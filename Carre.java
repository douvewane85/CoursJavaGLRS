import java.lang.Math;
public class Carre extends Figure{

//@Override => methode Redefinie
   
  //Constructeur par défaut
   //Surcharge
    //Deux methodes sont surchargées lorsqu'elles:
     //1-Ont le meme nom et le meme type retour
    //Mais elles doivent pas avoir le meme nombre Arguments
     //Ou si elles le meme nombre Arguments alors les arguments
    //ne doivent pas etre du meme type
   public Carre (){
   }

   //Surchage
    public Carre (double longueur){
       this.longueur=longueur;
   }


   @Override
   public double demiPerimetre() {
      return this.longueur*2;
   }   

  @Override
   public double surface() {
     return this.longueur*this.longueur;
} 


  @Override
   public double diagonale(){
     return Math.sqrt(Math.pow(this.longueur,2)+Math.pow(this.longueur,2));
     
   }   

}