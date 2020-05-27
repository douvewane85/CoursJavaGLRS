public class Service {

     //Taille Reservation :nbre Cellule du Tableau
      final int TAILLE=10;
    //Taille Réélle :nbre element du Tableau
      private int nbreClasse=0;//nbre Classe dans le tableau ,
                               //mais aussi la position d'insertion
      private int nbrePersonne=0;
    //Declaration des Tableaux
    private Classe tabclasse[];
    private Personne [] tabPersonne;

    public Service(){
        //Creation du Tableau
        tabclasse=new Classe[TAILLE];
        tabPersonne=new Personne[TAILLE];

    }


    public void creerClasse(Classe classe){
        if(nbreClasse<TAILLE){
            tabclasse[nbreClasse]=classe;
            nbreClasse++;
        }else{
            System.out.println("Tableau Rempli");
        }
        
    }
    public void listerClasse(){
        for(int i=0;i<nbreClasse;i++){
            System.out.println(tabclasse[i].affiche());
        }
        
    }

    public void  ajouterPersonne(Personne pers){

    }

    public void listerEudiantParClasse(){
       
        
    }

    //Uc 



    
}