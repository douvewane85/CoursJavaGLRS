//java.lang
//System.out =>Ecran
//System.in =>Clavier
import java.util.Scanner;
public class Main {
        //Declaration de variables => portée de classe
       public static void main(String args[]){
               /*
                System.out.println("Bonjour à Tous"); 
               System.out.println("les etudiants de la GLRS et MAE "); 
               //Scanner clavier pour lire les données tapeés au clavier
               Scanner clavier=new Scanner(System.in);
               System.out.println("Veuillez saisir un Mot");
               //Lire une donnée de type chaine 
               String prenom=clavier.next();
               System.out.println("Bonjour "+prenom); 
               
               //type primitifs ou de données  => int ,    float, double, char,      boolean 
               //classes wappers ou Enveloppes => Integer, Float, Double, Character, Boolean
               
               System.out.println("Veuillez saisir un entier");
               int x=clavier.nextInt();
               System.out.println("Le nombre est "+x); 
          
             // Figure f=new Figure(); impossible car //Figure est classe Abstraite

                Carre c=new Carre();
                c.setLongueur(12);
                System.out.println("La Longueur est "+                     c.getLongueur());
                 //Surcharge
                Carre c1=new Carre(15);
                System.out.println("La Longueur est "+                     c1.getLongueur());
                 System.out.println("Le Demi Perimetre est "+                     c1.demiPerimetre());
                 System.out.println("Le Perimetre est "+                     c1.perimetre());
            System.out.println("La Surface est "+                     c1.surface());
            System.out.println("La Diagonale est "+                     c1.diagonale());
   */
int choix;
Carre carre=new Carre();
do{
              System.out.println("1- Ajout Carre");
              System.out.println("2- Lister Carre");
              System.out.println("3- Ajout Rectangle");
              System.out.println("4- Lister Rectangle");
              System.out.println("5- Quitter");
              System.out.println("Faites votre choix");
              Scanner clavier=new Scanner(System.in);
              choix=clavier.nextInt();
            /* 
              if(choix==1){
               }
               if(choix==2){
              }
            */
         
           switch(choix){
            case 1:
              System.out.println("Veuillez saisir la Longeur");
                   double longueur=clavier.nextDouble();
                   carre.setLongueur(longueur);
             break;
            case 2:
                 System.out.println("La Longueur est "+carre.getLongueur());
                 System.out.println("Le Demi Perimetre est "+carre.demiPerimetre());
                 System.out.println("Le Perimetre est "+ carre.perimetre());
                 System.out.println("La Surface est "+ carre.surface());
                 System.out.println("La Diagonale est "+carre.diagonale());
             break;
           }

     } while(choix!=5);


                  
       }

}

/*Portée block
 {
    int var1=2;
    {
       int var2;
      //Possible
       int s=var1+var2;
    }
      //Impossible
       int s=var1+var2;//var2 n'existe pas dans ce bloc
 }
*/


