import java.time.LocalDate;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
    
String choix;
     Scanner clavier=new Scanner(System.in);
     Service service =new Service();
    do {

        System.out.println("1-Creer Classe");
        System.out.println("2-Afficher Classe ");
        System.out.println("4-Inscrition Etudiant ");
        System.out.println("5-Afficher les Etudiants d'une classe ");
        System.out.println("6-Affecter un Professeur à une classe ");
        System.out.println("7-Afficher les Professeurs d'une classe ");
        System.out.println("3-Quitter");
        System.out.println("Faites votre choix");
        choix=clavier.nextLine();
        switch(choix){
            case "1":
            System.out.println("Entrer le libelle de la Classe");
               String libelle =clavier.nextLine();
               Classe cl=new Classe(libelle);
               service.creerClasse(cl);
            break;

            case "2":

            service.listerClasse();
            break;

            case "4":
            System.out.println("Entrer le Nom Complet");
            String nomComplet =clavier.nextLine();
            System.out.println("Entrer la Date Naissance");
            LocalDate dateNaiss= LocalDate.now();
            System.out.println("Entrer le Tuteur");
            String tuteur =clavier.nextLine();
            System.out.println("Entrer l'Année");
            int annee =clavier.nextInt();
            System.out.println("Saisir l'ID de la Classe");
            service.listerClasse();
            int idClasse=clavier.nextInt();
            Classe classeEtu=new Classe();
            classeEtu.setId(idClasse);

            Etudiant et =new Etudiant(nomComplet, dateNaiss, tuteur, annee);
                   et.setClasse(classeEtu);
              service.ajouterPersonne(et);

            break;

            case "5":
            System.out.println("Saisir l'ID de la Classe");
            service.listerClasse();
            int id=clavier.nextInt();
            Classe classe=new Classe();
            classe.setId(id);
            service.listerEtudiantParClasse(classe);
            break;

        }
        
    } while (choix!="3");

        
}
    
}