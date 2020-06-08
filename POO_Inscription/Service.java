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
            //Generer ID de la Classe
            classe.setId(nbreClasse+1);
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
          tabPersonne[nbrePersonne]=pers;
           nbrePersonne++;

    }

    public void listerEtudiantParClasse(Classe classe){
        for(int i=0;i<nbrePersonne;i++){
            if(tabPersonne[i] instanceof Etudiant){
                //Convertion d'une Personne en un Etudiant=> downCasting
                //((Etudiant)tabPersonne[i]) possible car Etudiant herite de Personne
                   if(((Etudiant)tabPersonne[i]).getClasse().getId()==classe.getId()){
                       System.out.println(tabPersonne[i].affiche());
                   }
            }
           
        }
        
    }

    //Uc 



    
}